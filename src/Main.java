import java.util.Scanner;

public class Main {

    static int recPower(int taban, int us){

        if(us==0){

            return 1;
        }else if (taban==1){

            return 1;
        }else
           return taban*recPower(taban,us-1);
    }

    public static void main(String[] args) {
        int taban,us;
        Scanner input = new Scanner(System.in);
        System.out.print("Taban Değeri Giriniz: ");
        taban=input.nextInt();
        System.out.print("Üs Değeri Giriniz: ");
        us= input.nextInt();

        System.out.println("Sonuç : "+ recPower(taban,us));

    }
}
