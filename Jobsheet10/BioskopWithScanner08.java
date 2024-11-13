import java.util.Scanner;

public class BioskopWithScanner08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih opsi: ");
            int menu = sc.nextInt();
            sc.nextLine();  

            switch (menu) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan nomor baris : ");
                        int baris = sc.nextInt();
                        System.out.print("Masukkan nomor kolom : ");
                        int kolom = sc.nextInt();
                        sc.nextLine();  
                    
                        if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                            if (penonton[baris - 1][kolom - 1] == null) {
                                System.out.print("Masukkan nama penonton baris " + baris + ", kolom " + kolom + ": ");
                                penonton[baris - 1][kolom - 1] = sc.nextLine();
                                break;  
                            } else {
                                System.out.println("Kursi pada baris " + baris + ", kolom " + kolom + " sudah terisi. Silakan pilih kursi lain.");
                            }
                        } else {
                            System.out.println("Nomor baris atau kolom tidak valid, silakan coba lagi.");
                        }

                        
                        System.out.println("Input Penonot lainnya (y/n)");
                        String next = sc.nextLine();

                        if(next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.print("Penonton pada baris ke-" + (i + 1) + ": ");
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.print("***\t");
                            }else {
                                System.out.print(penonton[i][j] + "\t");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Keluar dari program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opsi tidak valid, silakan coba lagi.");
                    break;
            }
        }
    }
}
