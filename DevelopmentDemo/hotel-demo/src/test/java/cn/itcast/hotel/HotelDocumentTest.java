package cn.itcast.hotel;

import cn.itcast.hotel.pojo.Hotel;
import cn.itcast.hotel.pojo.HotelDoc;
import cn.itcast.hotel.service.IHotelService;
import com.alibaba.fastjson.JSON;
import org.apache.http.HttpHost;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.common.xcontent.XContentType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.List;

@SpringBootTest
class HotelDocumentTest {

    private RestHighLevelClient client;

    @Autowired
    private IHotelService hotelService;

    private static final String MAPPING_TEMPLATE="{mappings:{properties:{id:{type:keyword}}";


    //批量导入
    @Test
    public void bulkDocument() throws IOException {
        //1.创建request对象
        BulkRequest request = new BulkRequest();
        //2.准备参数
        List<Hotel> list = hotelService.list();
        for (Hotel hotel:list){
            HotelDoc hotelDoc = new HotelDoc(hotel);
            request.add(new IndexRequest("hotel")
                    .id(hotelDoc.getId().toString())
                    .source(JSON.toJSONString(hotelDoc),XContentType.JSON));
        }
        //3.发送请求
        client.bulk(request, RequestOptions.DEFAULT);
    }

    @Test
    public void addDocument() throws IOException {
        Hotel hotel = hotelService.getById(61083L);
        //转换为文档类型
        HotelDoc hotelDoc = new HotelDoc(hotel);
        //1.创建request对象
        IndexRequest request = new IndexRequest("hotel").id(hotelDoc.getId().toString());
        //2.准备json文档
        request.source(JSON.toJSONString(hotelDoc), XContentType.JSON);
        //3.发送请求
        client.index(request, RequestOptions.DEFAULT);
    }

    @Test
    public void getDocument() throws IOException {
        //1.创建request对象
        GetRequest request = new GetRequest("hotel","61083");
        //3.发送请求
        GetResponse response = client.get(request, RequestOptions.DEFAULT);
        //解析
        String json = response.getSourceAsString();

        HotelDoc hotelDoc = JSON.parseObject(json,HotelDoc.class);
        System.out.println(hotelDoc);
    }

    @Test
    public void updateDocument() throws IOException {
        //1.创建request对象
        UpdateRequest request = new UpdateRequest("hotel","61803");
        //2.准备文档
        request.doc(
                "age",18,
                "name","slz"
        );
        //3.发送请求
        client.update(request, RequestOptions.DEFAULT);
    }

    @Test
    public void deleteDocument() throws IOException {
        //1.创建request对象
        DeleteRequest request = new DeleteRequest("hotel","61803");
        //3.发送请求
        client.delete(request, RequestOptions.DEFAULT);
    }




    @BeforeEach
    void setUp(){
        this.client = new RestHighLevelClient(RestClient.builder(
                HttpHost.create("http://192.168.134.200:9200")
        ));
    }

    @AfterEach
    void tearDown() throws IOException {
        this.client.close();
    }

}
