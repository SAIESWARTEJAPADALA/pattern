import java.util.Scanner;
class Patternsquare
{
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out .println("enter a num");
        int n = scn.nextInt();
        for(int i =1; i<=n; i++){//rows
            
        
        for(int j = 1; j<=n; j++){//columns
            System.out.print(" * ");
        }
        System.out.println();
    }
        
    }
}