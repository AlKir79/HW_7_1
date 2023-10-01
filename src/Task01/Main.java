package Task01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task01 obj = new Task01();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter sequence (1 4,-4 6, etc)");
        System.out.println(obj.generateOutStr(in.nextLine()));
    }
}
