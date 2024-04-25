package main.java.com.ohgiraffers.section08.initblok;

public class Application {

    public static void main(String[] args){
        Product product = new Product();
        System.out.println(product);

        System.out.println("product 2 ");
        Product product1 = new Product();
        System.out.println(product1);

        System.out.println(Product.getBrand());

        Product test1 = new Product();
        test1.salry(30);
        Product test2 = new Product();
        test2.salry(30);

        Product.makeProduct(100);

        Product test3 = new Product();
        System.out.println(test3.salry(100));

    }


}
