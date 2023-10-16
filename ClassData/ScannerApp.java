package ClassData;

import java.util.Scanner;

public class ScannerApp {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukan Nama : ");
        String nama = scan.nextLine();

        System.out.println("Nama anda adalah " + nama);

    }

    
}
