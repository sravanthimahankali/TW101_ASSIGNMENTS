import java.util.Scanner;

public class PrintVertical{
    public  static void main(String[] args){
        System.out.println("enter the number");
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        while (n>0){
            System.out.println("*");
            n=n-1;
        }
    }
}
