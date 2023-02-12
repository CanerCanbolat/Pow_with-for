import java.util.Scanner;
public class Pow_with_for {
    public static void main (String[] args) {
        int a,b,us=1 ;
        Scanner inp =  new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz : ");
        a=inp.nextInt();
        System.out.print("Üs olacak sayıyı giriniz : ");
        b=inp.nextInt();
        for (int i = 1; i <= b; i++) {
            us=us*a;
        }
        System.out.print(a+"'nın "+b+"'inci kuveeti = "+us);
    }
}
