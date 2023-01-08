import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class calk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("№+enter");
            System.out.println("1.+");
            System.out.println("2.-");
            System.out.println("3.*");
            System.out.println("4./");
            System.out.println("5.exit");
            int person = scanner.nextInt();
            int result;
            if (person == 5){
                break;
            } else if (person == 1) {
                System.out.println("a:");
                int a = scanner.nextInt();
                System.out.println("b:");
                int b = scanner.nextInt();
                System.out.println("а : " + a);
                System.out.println("b : " + b);
                result = a + b;
                System.out.println("ответ : " + result);
            } else if (person == 2) {
                System.out.println("a:");
                int a = scanner.nextInt();
                System.out.println("b:");
                int b = scanner.nextInt();
                System.out.println("а : " + a);
                System.out.println("b : " + b);
                result = a - b;
                System.out.println("ответ : " + result);
            } else if (person == 3) {
                System.out.println("a:");
                int a = scanner.nextInt();
                System.out.println("b:");
                int b = scanner.nextInt();
                System.out.println("а : " + a);
                System.out.println("b : " + b);
                result = a * b;
                System.out.println("ответ : " + result);
            } else if (person == 4) {
                System.out.println("a:");
                int a = scanner.nextInt();
                System.out.println("b:");
                int b = scanner.nextInt();
                if (b == 0){
                    System.out.println("На ноль не делится");
                }
                System.out.println("а : " + a);
                System.out.println("b : " + b);
                result = a / b;
                System.out.println("ответ : " + result);
            } else {
                System.out.println("Error");
            }
        }
        System.out.println("ВЫХОД");
    }
}
