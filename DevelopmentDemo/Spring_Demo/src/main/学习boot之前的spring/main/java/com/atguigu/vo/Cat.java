package com.atguigu.vo;

public class Cat {
    private String cardId;
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Cat{" +
                "cardId='" + cardId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Cat() {
    }

    public Cat(String cardId, String name, Integer age) {
        this.cardId = cardId;
        this.name = name;
        this.age = age;
    }
}
