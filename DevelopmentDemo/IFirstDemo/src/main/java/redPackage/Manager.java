package redPackage;

import java.util.ArrayList;

public class Manager extends User {
    public Manager(String name, int money) {
        super(name, money);
    }

    public Manager() {
    }

    public ArrayList<Integer> send(int totalMoney, int count) {
        //创建一个红包
        ArrayList<Integer> redList = new ArrayList<>();

        //群主的钱包余额
        int leftMoney = super.getMoney();
        if (totalMoney > leftMoney) {
            System.out.println("余额不足");
            return redList;     //返回空集合
        }
        //扣钱，重新设置余额
        super.setMoney(leftMoney - totalMoney);


        int avg = totalMoney / count;
        int mod = totalMoney % count;

        for(int i = 0;i<count-1;i++){
            redList.add(avg);
        }

        //除不开的 包在最后一个红包当中
        int last = avg+mod;
        redList.add(last);

        return redList;
    }

}

