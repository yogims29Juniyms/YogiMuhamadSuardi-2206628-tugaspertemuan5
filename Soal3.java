/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5pbo;
import java.util.Scanner;

public class Soal3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan a: ");
        int a = scanner.nextInt();
        System.out.print("Masukkan bilangan b: ");
        int b = scanner.nextInt();
        int gcdResult = hitungGCD(a, b);
        System.out.println("Pembagi Terbesar Bersama dari " + a + " dan " + b + " adalah: " + gcdResult);
    }

    static int hitungGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
