// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class java {
    public static void main(String[] args) {
        int n1=0,n2=1,n3,n;
        
        Scanner input = new Scanner(System.in);
        System.out.println("enter: ");
        n = input.nextInt();
        
        System.out.print(n1+" "+n2);
        
        for(int i = 2 ; i<n; i++){
            n3 = n2 + n1;
            System.out.print(" "+n3);
            
            n1=n2;
            n2=n3;
        }
        
    }
}