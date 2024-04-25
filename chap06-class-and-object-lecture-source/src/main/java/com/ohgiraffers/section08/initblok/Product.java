package main.java.com.ohgiraffers.section08.initblok;

import java.util.Objects;

public class Product {

    private String name ="사이언";
    private int price;
    private static String brand;
    private static int 개수  = 100;

    // 인스턴스 초기화 블럭
    {
        name = "사이언";
        price = 100000;
        brand = "사과";
    }

    public String salry(int num){
        if(Product.개수 == 0){
            return "재고가 부족합니다. 주문을 취소해주세요";
        }

        Product.개수 -= num;

        if(Product.개수 < 0){
            System.out.println("재고가 부족합니다 수량을 확인해주세요 \n 현재 재고 : " + Product.개수);
        }

        return "주문이 접수되었습니다.";

    }
    public static void makeProduct(int num){
        Product.개수 += num;
        System.out.println(" 요구르트 생성됨 현재 재고 " + Product.개수);
    }

    static {
//        name ="손오공";
////        price = 10000;
        brand = "드래곤볼";
    }

    public Product() {
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static String getBrand() {
        return brand;
    }

    public static void setBrand(String brand) {
        Product.brand = brand;
    }




    @Override
    public String toString() {
        return "Product{" +
                "name='" + this.name + '\'' +
                ", price=" + this.price +
                Product.brand +
                '}';
    }

}
