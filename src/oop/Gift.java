package oop;

public class Gift {

    //Fields
    float price;
    char size;
    String material;
    private boolean forChildren;

    //Setter methods

    public void setSize(char size) {
        this.size = size;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public void setForChildren(boolean forChildren) {
        this.forChildren = forChildren;
    }

    //Getter methods


    public char getSize() {
        return size;
    }
    public float getPrice() {
        return price;
    }
    public String getMaterial() {
        return material;
    }
    public boolean getForChildren() {
        return forChildren;
    }

    public void gifting(String name, String message){
        System.out.println("Gift for " + name);
        System.out.println("\t Message: " + message);
        System.out.println("\t Price " + price +"$");
        System.out.println("\t Size: " + size);
        System.out.println("\t Material: " + material);
        if(forChildren){
            System.out.println("\t You have been a good kid this year");
        }else{
            System.out.println("\t Please give this to your parents");
        }
    }
}
