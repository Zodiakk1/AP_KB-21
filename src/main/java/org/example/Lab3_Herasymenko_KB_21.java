package org.example;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.util.Scanner;

public class Lab3_Herasymenko_KB_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть ціле, дійсне, рядок та boolean: ");
        int i = sc.nextInt();
        double d = sc.nextDouble();
        sc.nextLine(); // очиста буфера
        String s = sc.nextLine();
        boolean b = sc.nextBoolean();

        System.out.println("/n--- 10 ВАРІАНТІВ ФОРМАТУВАННЯ ---");

        System.out.println("1. " + i + " | " + d + " | " + s + " | " + b);
        System.out.printf("2. %d | %.2f | %s | %b/n", i, d, s, b);
        System.out.printf("3. Hex: %X | %f | %s | %B/n",i, d, s, b);
        System.out.printf("4. Octal: %o | Exp: %e | %s | %b/n", i, d, s, b);
        System.out.printf("5. Праве вирівнювання: [%10d] | [%12.3f] | [%20s] | [%8b]/n", i, d, s, b);
        System.out.printf("6. Ліве вирівнювання: [%-10d] | [%-12.3f] | [%-20s] | [%-8b]/n", i, d, s, b);
        System.out.printf("7. Нулі та max: 5 символів рядка: %08d | %.4f | %.5s | %b/n", i, d, s, b);
        System.out.printf("8. Знак (+/-) та ширина/довжина: %+d | %+.2f | [%15.8s] | %b/n", i, d, s, b);

        System.out.println(MessageFormat.format("9. MessageFormat: {0} | {1,number,#,##0.00} | ''{2}'' | {3}", i, d, s, b));
        System.out.printf("10. Bin & DecimalFormat: %s | %s | %s | %s/n",
                Integer.toBinaryString(i), new DecimalFormat("#,##0.00").format(d), s.toUpperCase(), !b);

        sc.close();
    }
}