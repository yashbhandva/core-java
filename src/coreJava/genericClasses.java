package coreJava;


import Java8NewFeatures.LocalDateTimes;

import java.time.LocalDateTime;

class GenericClass<T>{
    T container;
    public GenericClass(T container){
        this.container = container;
        System.out.println(this.container);
    }

    public void setContainer(T container) {
        this.container = container;
    }
}
public class genericClasses {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        GenericClass<String> genericClass = new GenericClass<>("hello");
        genericClass.setContainer("hi");
        System.out.println(genericClass.container.getClass().getName());


        GenericClass<Integer> genericClass1 = new GenericClass<>(999);
        genericClass1.setContainer(664);
        System.out.println(genericClass1.container.getClass().getName());
    }
}
