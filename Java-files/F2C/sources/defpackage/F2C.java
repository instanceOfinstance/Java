package defpackage;

import java.util.Scanner;
/* renamed from: F2C  reason: default package */
/* loaded from: F2C.class */
public class F2C {
    public static void main(String[] strArr) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        System.out.println("Temperature in Celsius: " + (((scanner.nextDouble() - 32.0d) * 5.0d) / 9.0d));
    }
}
