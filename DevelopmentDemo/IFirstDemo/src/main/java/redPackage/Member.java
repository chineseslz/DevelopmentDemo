package redPackage;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{
    public Member(String name, int money) {
        super(name, money);
    }

    public Member() {
    }


    public void receive(ArrayList<Integer> list){
        //从多个红包中随机抽取一个，给自己
        //随机获取一个集合当中的索引编号
        int index = new Random().nextInt(list.size());
        //根据索引，从集合当中删除
        int delMoney = list.remove(index);
        int money = super.getMoney();
        super.setMoney(money+delMoney);
    }

}
