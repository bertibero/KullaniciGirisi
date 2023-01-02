import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username,password, ans, newpassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        username = input.nextLine();

        System.out.print("Şifrenizi Giriniz : ");
        password =input.nextLine();

        if (username.equals("patika") && password.equals("java123")){
            System.out.println("Sisteme giriş yaptınız..!");

        }else {
            System.out.println("Bilgilerinizi Kontrol Ediniz..!");
            System.out.println("şifrenizi değiştirmek ister misiniz ? (Evet veya Hayır)");

            ans = input.nextLine();

            if (ans.equals("Evet")) {
                System.out.println("Yeni Şifrenizi Giriniz");

                newpassword = input.nextLine();

                if (newpassword.equals("java123") || newpassword.equals(password)) {
                    System.out.println("Geçersiz Şifre Yeniden Deneyin");

                } else {
                    System.out.println("Yeni Şifreniz Oluşturuldu");
                    System.out.println("Yeni Şifreniz :" + newpassword);
                }
            }else {
                System.out.println("Lütfen Şifre Girişini Tekrar Deneyiniz");
            }
        }
    }
}