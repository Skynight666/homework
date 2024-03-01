import java.util.Scanner;
public class JPA103 {

    public static void main(String[] args) {
        System.out.println("Please input:");
        Scanner scn=new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int num3 = scn.nextInt();
        int sum = num1 + num2 + num3;
        double average = (double) sum / 3;
        System.out.printf("Average: %.2f%n", average);

    }
}
