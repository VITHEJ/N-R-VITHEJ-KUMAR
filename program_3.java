import java.util.Scanner;
public class program_3 {
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int val=1;
        if(a==1||a==2)System.out.println(val);
        else{
            for(int i=1;i<=a;i++){
            
                System.out.print(val+",")  ;
                val+=2;       
        }

        }
        System.err.println();
        


        sc.close();

    }
}
