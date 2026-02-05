import java.util.Scanner;
public class countfig {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r = n%8;
        int result;
        if(r==1)
            result = 1;
        else if(r==2)
            result = 2;
        else if(r==3)
            result = 3;
        else if(r==4)
            result = 4;
        else if(r==5)
            result=5;
        else if(r==6)
            result = 4;
        else if(r==7)
            result = 3;
        else 
            result = 2;
 System.out.println(result);


    }
    
}
