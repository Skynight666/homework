import java.util.Scanner;

public class JPA105 {
    
    public static void main(String[] args) {
        System.out.println("請輸入你的姓名:");
        Scanner scn = new Scanner(System.in);
        String name = scn.next(); 
        System.out.println("HI." + name + ",請輸入你的銅板數量");
        System.out.println("請輸入1元的數量:");
        int x1 = scn.nextInt();
        System.out.println("請輸入5元的數量:");
        int x5 = scn.nextInt();
        System.out.println("請輸入10元的數量:");
        int x10 = scn.nextInt();
        System.out.println("請輸入50元的數量:");
        int x50 = scn.nextInt();
        int total = x1 * 1 + x5 * 5 + x10 * 10 + x50 * 50;
        int thousand = total / 1000;
        int hundred = (total % 1000) / 100;
        int ten = (total % 100) / 10;
        int one = total % 10;
        System.out.println("你的錢總共有:"+thousand+"千"+hundred+"百"+ten+"十"+one+"元");
    }
}

