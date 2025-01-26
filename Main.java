import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner latf=new Scanner(System.in);

        System.out.println("Lütfen faktöriyelini hesaplayacağımız sayıyı girin");
    int sayi=latf.nextInt();
    int toplam=1;
    for (int i=sayi; i>1; i--){
            toplam= toplam * i;

        }
        System.out.println("Faktöriyel :"+toplam);
    }
}