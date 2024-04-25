package main.java.com.ohgiraffers.section01;

public class WildCardFarm {

    public void anyType(RabbitFarm<?> fram){
        fram.getAnimal().cry();
    }

    public void extednsType (RabbitFarm<? extends Bunny> faram){
        faram.getAnimal().cry();
    }

    public void superType(RabbitFarm<? super Bunny> farm){
        farm.getAnimal().cry();
    }
}
