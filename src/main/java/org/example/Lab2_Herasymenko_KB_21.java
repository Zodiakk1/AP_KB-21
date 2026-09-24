package org.example;

import java.util.Scanner;

public class Lab2_Herasymenko_KB_21 {
    public static void main(String[] args) {

        System.out.println("=== Інформація про примітивні типи даних ===");

        System.out.println("byte: " + Byte.SIZE + " біт, min=" + Byte.MIN_VALUE + ", max=" + Byte.MAX_VALUE);
        System.out.println("short: " + Short.SIZE + " біт, min=" + Short.MIN_VALUE + ", max=" + Short.MAX_VALUE);
        System.out.println("int: " + Integer.SIZE + " біт, min=" + Integer.MIN_VALUE + ", max=" + Integer.MAX_VALUE);
        System.out.println("long: " + Long.SIZE + " біт, min=" + Long.MIN_VALUE + ", max=" + Long.MAX_VALUE);
        System.out.println("float: " + Float.SIZE + " біт, min=" + Float.MIN_VALUE + ", max=" + Float.MAX_VALUE);
        System.out.println("double: " + Double.SIZE + " біт, min=" + Double.MIN_VALUE + ", max=" + Double.MAX_VALUE);
        System.out.println("char: " + Character.SIZE + " біт, min=" + (int) Character.MIN_VALUE + ", max=" + (int) Character.MAX_VALUE);
        System.out.println("boolean: 1 біт, значення true/false");

        System.out.println();


        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть число типу byte: ");
        byte vByte = Byte.parseByte(sc.nextLine());
        System.out.println("Ви ввели byte: " + vByte);

        System.out.print("Введіть число типу short: ");
        short vShort = Short.parseShort(sc.nextLine());
        System.out.println("Ви ввели short: " + vShort);

        System.out.print("Введіть число типу int: ");
        int vInt = Integer.parseInt(sc.nextLine());
        System.out.println("Ви ввели int: " + vInt);

        System.out.print("Введіть число типу long: ");
        long vLong = Long.parseLong(sc.nextLine());
        System.out.println("Ви ввели long: " + vLong);

        System.out.print("Введіть число типу float: ");
        float vFloat = Float.parseFloat(sc.nextLine());
        System.out.println("Ви ввели float: " + vFloat);

        System.out.print("Введіть число типу double: ");
        double vDouble = Double.parseDouble(sc.nextLine());
        System.out.println("Ви ввели double: " + vDouble);

        System.out.print("Введіть символ типу char: ");
        char vChar = sc.nextLine().charAt(0);
        System.out.println("Ви ввели char: " + vChar);

        System.out.print("Введіть true/false для типу boolean: ");
        boolean vBoolean = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Ви ввели boolean: " + vBoolean);

        System.out.println();
        System.out.println("Дякую, що спробували! Код був написаний Герасименко Романом.");
    }
}
