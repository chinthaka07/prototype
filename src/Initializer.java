public class Initializer {
    public static void main(String[] args) throws CloneNotSupportedException {
        ComputerShop sh1 = new ComputerShop();
        ComputerShop sh2 = (ComputerShop) sh1.clone();
        System.out.println(sh1==sh2);

    }
}
