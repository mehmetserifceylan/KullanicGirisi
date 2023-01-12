import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input=new Scanner(System.in);

        System.out.print("Kullanıcı Adınız:");
        userName=input.nextLine();
        System.out.print("Şifreniz:");
        password=input.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Başarılı.");
        }
        else {
            System.out.println("Geçersiz Bilgiler.");
            if (password.equals("java123")==false){
                System.out.println("Şireyi sıfırlamak istermisiniz (1-Evet 2-Hayır):");
                int secim=input.nextInt();
                if (secim==1){
                    System.out.println("Lütfen yeni şifreyi giriniz:");
                    String newPassword=input.nextLine();
                    if (newPassword.equals("java123")){
                        System.out.println("Şifre Oluşturulamadı");
                    }
                    else{
                        System.out.println("Şifre oluşturuldu");
                    }
                }
                else {
                    System.out.println("Şifreniz Yanlış");
                }


            }
            else {
                System.out.println("Kullanıcı adı geçersiz.");
            }
        }
    }
}