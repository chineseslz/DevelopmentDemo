package redPackage;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",100);

        Member A = new Member("A",0);
        Member B = new Member("B",0);
        Member C = new Member("C",0);


        manager.show();
        A.show();
        B.show();
        C.show();
        System.out.println("================");


        ArrayList<Integer> redList = manager.send(20,3);
        A.receive(redList);
        B.receive(redList);
        C.receive(redList);

        manager.show();
        A.show();
        B.show();
        C.show();
        System.out.println("================");

    }
}
