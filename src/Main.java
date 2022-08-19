import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        int min=0,max=0,deger,sayi,sayac=1;
        System.out.print("Kaç tane sayı gireceksiniz :");
        sayi = girdi.nextInt();

        while (sayi>=sayac){
            System.out.print(sayac+". Sayıyı giriniz: ");
            deger = girdi.nextInt();
            if(deger<min){
                min = deger;
            }
            if(deger>max){
                max = deger;
            }
            sayac++;
        }
        System.out.print(max +" "+min);


    }
}
