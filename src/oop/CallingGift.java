package oop;

public class CallingGift {
    public static void main(String[] args) {

        //Creating a Gift object
        Gift gift1 = new Gift();

        gift1.setPrice(129.99f);
        gift1.setSize('L');
        gift1.setMaterial("Plastic");
        gift1.setForChildren(false);

        System.out.println(gift1.getPrice());

        gift1.gifting("Teddy", "Happy Christmas!");
        gift1.gifting("Bob", "Hohoho");
    }
}
