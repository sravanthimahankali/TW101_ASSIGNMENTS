import java.util.Scanner;

public class IntroductoryAssignments {
    public  void printVerticalLine(){
        System.out.println("printing vertical line");
        System.out.println("enter the number");
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        while (n>0){
            System.out.println("*");
            n=n-1;
        }
        System.out.println();
    }
    void rightTriangle(){
        System.out.println("printing right triangle");
        System.out.println("enter the number:\n");
        Scanner s=new Scanner(System.in);
        int n =s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    void printAsterisk(){
        System.out.println("printing asterisk");
        System.out.print("*");
        System.out.println();
    }
    public  void printHorizontalLine(){
        System.out.println("printing horizontal line");
        System.out.println("enter the number");
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        while (n>0){
            System.out.print("*");
            n=n-1;
        }
        System.out.println();
    }
    public  void printIsoscelesTriangle(){
        System.out.println("printing isoscelec triangle");
        System.out.println("enter the number:\n");
        Scanner s=new Scanner(System.in);
        int n =s.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i; j++)
                System.out.print(" ");

            for(int j = 1; j <= i; j++)
                System.out.print("* ");

            System.out.print("\n");
        }
        System.out.println();
    }
    void fizzBuzz(){

        System.out.println("printing  the numbers  from 1 to 100");
        //Scanner s=new Scanner(System.in);
        //int n=s.nextInt();
        int x=1;
        while(x<=100){
            if(x%3==0&&x%5==0){System.out.println("FizzBuzz");}
            else if(x%3==0){System.out.println("Fizz");}
            else if(x%5==0){System.out.println("Buzz");}
            else {System.out.println(x);}
            x=x+1;
        }
        System.out.println();
    }
    public  void printDiamondWithName(){
        System.out.println("printing diamond with name");
        System.out.println("enter the number:\n");
        Scanner s=new Scanner(System.in);
        int n =s.nextInt();
        for(int i = 1; i <= n-1; i++) {
            for(int j = 1; j <= n-i; j++)
                System.out.print(" ");

            for(int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.print("\n");

        }
        System.out.println("Sravanthi");
        for(int i = n-1; i >= 1; i--) {
            for(int j = 1; j <= n-i; j++)
                System.out.print(" ");

            for(int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.print("\n");

        }
        System.out.println();
    }
    public void printDiamond(){
        System.out.println("printing diamond");
        System.out.println("enter the number:\n");
        Scanner s=new Scanner(System.in);
        int n =s.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i; j++)
                System.out.print(" ");

            for(int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.print("\n");

        }
        for(int i = n-1; i >= 1; i--) {
            for(int j = 1; j <= n-i; j++)
                System.out.print(" ");

            for(int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.print("\n");

        }
        System.out.println();
    }




}
