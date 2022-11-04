package id.pbo;
import java.util.Scanner;

public class Main{

    public static String[] loginPage(){
        Scanner input = new Scanner(System.in);
        System.out.println("==============================");
        System.out.print("Masukkan Username: ");
        String userName = input.nextLine();
        System.out.print("Masukkan Password: ");
        String passWord = input.nextLine();
        System.out.println("==============================");
        String[] akun = {userName, passWord};
        return akun;
    }

    public static String menuPage(){
        Scanner input = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("Pilih Menu: ");
        System.out.println("1 Tambah Buku");
        System.out.println("2 Ubah Buku");
        System.out.println("3 Hapus Buku");
        System.out.println("4 Tambah Anggota");
        System.out.println("5 Ubah Anggota");
        System.out.println("6 Hapus Anggota");
        System.out.println("7 Pinjam Buku");
        System.out.println("8 Kembalikan Buku");
        System.out.println("9 Keluar");
        String menu = input.nextLine();
        return menu;
    }

    public static void main(String[] args) {
        String[] akun;
        String idMenu;
        Boolean isLogin;

        do {
            akun = loginPage();
            Petugas petugas = new Petugas(akun[0], akun[1]);
            petugas.login(petugas.getUsername(), petugas.getPassword());
            isLogin = petugas.isLoginSatus();
        } while (isLogin == false);

        idMenu = menuPage();
    }
}