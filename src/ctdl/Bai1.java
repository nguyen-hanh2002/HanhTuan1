/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctdl;

import java.util.Scanner;

/**
 *
 * @author son tuan
 */
public class Bai1 {

    public static void main(String[] args) {

        int a[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 10 phan tu cua mang: ");
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Mang vua nhap: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("\t" + a[i]);
        }
        System.out.println("\n");
        int temp;
         for (int i = 0 ; i < 9; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (a[i] > a[j]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
         System.out.println("Mang Tang Dan La: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("\t" + a[i]);
        }
         System.out.println("\n");
         for (int i = 0 ; i < 9; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (a[i] < a[j]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
          System.out.println("Mang Giam Dan La: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("\t" + a[i]);
        }
         System.out.println("\n");
    }

}
