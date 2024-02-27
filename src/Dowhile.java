import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 5 ");
        int value = scanner.nextInt();
        while (value !=5){
            System.out.println("Input 5 ");
            value = scanner.nextInt();
        }
        System.out.println("You input 5");
    }
}
