import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int first = 15;
        int second = 20;
        System.out.println(first + second);
        String name = "Ivan";
        String hello = "Hello, ";
        System.out.println(hello + name);

        int a = 0;
        int b = 0;
        a = a - 40 + 20;
        System.out.println("a = " + a + "b = " + b);

        double number = Math.random();
        System.out.println(number);
        int num = -5;
        System.out.println(Math.abs(num));

        System.out.println("How many KGS you have?");
        Scanner scanner = new Scanner(System.in);
        int someAmount = sc.nextDouble();
        double kurs = 84.8;
        double dollars = somAmount / kurs;
        System.out.println("you have" + dollars + "$!");




    }
}