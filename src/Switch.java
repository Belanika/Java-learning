public class Switch {
    public static void main(String[] args) {
        int month = 2;

        switch (month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
