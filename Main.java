import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        do {
            System.out.print("Bir sayı giriniz: ");
            n = inp.nextInt();
            for(int i=1,k=1;i<n || k<n; i*=4,k*=5){
                System.out.println(i + " " +k);
            }
        }
        while(n<0);


    }
}