import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Kullanıcı Adınızı Giriniz :");
            userName = input.nextLine();
            System.out.print("Parolanızı Giriniz : ");
            password = input.nextLine();
            if (userName.equals("Tunahan") && password.equals("12345")) {
                System.out.println("Bankamıza Hoşgeldiniz...");
                do {
                    System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz");
                    System.out.println("1- Para Yatırma\n2- Para çekme \n3- Bakiye Sorgulama\n4- Çıkış Yap ");
                    select = input.nextInt();
                    if (select == 1){
                        System.out.println("Para Miktarı");
                        int prize = input.nextInt();
                        balance+=prize;
                        System.out.println("Para Yatırma İşlemi Gerçekleşti !");
                    } else if (select==2) {
                        System.out.println("Para Miktarı");
                        int price = input.nextInt();
                        if (price > balance){
                            System.out.println("Bakiye Yetersiz!");
                        }else {
                            balance-=price;
                        }
                    } else if (select == 3) {
                        System.out.println("Bakiyeniz : " + balance);
                    }
                }while (select != 4);
                System.out.println("Tekrar Görüşmek Üzere !");
                break;
            }else {
                right--;
                System.out.println("Hatalı Kullanıcı Adı Veya Şifre. Tekrar Deneyiniz");
                if (right == 0){
                    System.out.println("Hesabınız Bloke Olmuştur Bankanızla İletişime Geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right );
                }
            }
        }


    }
}