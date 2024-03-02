import java.util.Scanner;

public class JPA104 {
    
    public static void main(String[] args) {
        System.out.println("輸入第一組的x和y座標:");
        Scanner scn = new Scanner(System.in);
        double x1 = scn.nextDouble();
        double y1 = scn.nextDouble();
        System.out.println("輸入第二組的x和y座標:");
        double x2 = scn.nextDouble();
        double y2 = scn.nextDouble();
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        distance = Math.round(distance * 100.0) / 100.0;
        System.out.println("介於(" + String.format("%.2f", x1) + ", " + String.format("%.2f",y1) + ")和(" +
                String.format("%.2f", x2) + ", " + String.format("%.2f",y2) + ")之間的距離是:" + distance);
    }
}
