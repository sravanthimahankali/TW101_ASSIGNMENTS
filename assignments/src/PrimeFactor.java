import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args){
        ArrayList<Integer> a=generatePrimeFactor();
        for(int i=0;i<a.size();i++) System.out.println(a.get(i));

    }
    static ArrayList<Integer> generatePrimeFactor(){
        System.out.println("priting the prime factors");
        System.out.println("enter the number");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        if(n==1){
            return arrayList;
        }
        int i=2;
        while(n>1) {

                if (n % i == 0) {

                    n = n / i;

                    if(checkForPrime(i)){
                        arrayList.add(i);
                        //System.out.println(i);
                    }

                }else{
                    i++;}

            }

    return arrayList;

    }
    static boolean checkForPrime(int i){
        int count=1;
        for(int j=2;j<=i;j++){
            if(i%j==0)
                count++;
        }
        if(count==2)
            return true;
        return false;
    }
}

