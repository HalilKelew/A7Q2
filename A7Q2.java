package assignments;
import java.util.Scanner;

public class A7Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalPrice = 0.0;
        System.out.println("Enter the screen size");
        double screenSize = input.nextDouble();
        if (screenSize == 13.3) {
            totalPrice = totalPrice + 200;
        } else if (screenSize == 15 || screenSize == 15.0) {
            totalPrice = totalPrice + 300;
        } else if (screenSize == 17.3) {
            totalPrice = totalPrice + 300;
        } else {
            System.out.println("404..screen size not found");
        }
        System.out.println("Enter the processor");
        String CPU = input.next();
        switch (CPU) {
            case "i3" -> totalPrice = totalPrice + 150;
            case "i5" -> totalPrice = totalPrice + 250;
            case "i7" -> totalPrice = totalPrice + 350;
            default -> System.out.println("404...CPU not found");
        }
        System.out.println("Enter the RAM size");
        int ramGB = input.nextInt();
        double ramGBPrice = ramGB * 12.5;
        totalPrice = totalPrice + ramGBPrice;

        System.out.println("Enter the storage type");
        String storageType = input.next();
        double gbPrice = 0.0;
        if (storageType.equals("HDD"))
        {
            gbPrice = 0.1;
        }
        else if (storageType.equals("SSD"))
        {
            gbPrice = 0.2;
        }
        else
        {
            System.out.println("404...storage type not found");
        }
        System.out.println("Enter the memory in GB");
        int memory = input.nextInt();
        double memoryPrice = gbPrice * memory;
        totalPrice = memoryPrice + totalPrice;
        System.out.println("Enter the screen resolution");
        String resolution = input.next();
        if (resolution.equals("HD"))
        {
            totalPrice = totalPrice + 100;
        }
        else if (resolution.equals("4K"))
        {
            totalPrice = totalPrice + 200;
        }
        else
        {
            System.out.println("404...screen resolution type not found");
        }
        System.out.println("The laptop's price is $ "+totalPrice);
    }

}
