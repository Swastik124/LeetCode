import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int j=0;j<T;j++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(pallindrome(a,b));
        }
    }
    public static int pallindrome(int a,int b){
        
        int count=0;
        for(int i=a;i<=b;i++){
            int num=i;
            int rev=0;
            while(num!=0){
                rev=rev*10+ num%10;
                num=num/10;
            }
            if(i==rev){
                count++;
            }
        }
        return count;
    }
}
