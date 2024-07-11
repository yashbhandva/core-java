package coreJava;
 enum Food{
     MANO(100),BANANA(75),ORANGE(),APPLE(300);
     private int price;
     private Food(int price){
         this.price = price;
     }

     private Food() {
         price = 150;
     }

     public int getPrice() {
         return price;
     }
 }
public class EnumConstructor {
    public static void main(String[] args) {
        Food food = Food.BANANA;
        System.out.println(food);

        for (Food food1:Food.values()){
            System.out.println(food1+": "+food1.getPrice());
        }
    }
}
