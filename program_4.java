import java.util.Scanner;
import java.util.HashMap;

public class program_4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:arr){
            for(int divisor=1;divisor<=9;divisor++){
                if(num%divisor==0){
                    map.put(divisor,map.getOrDefault(divisor,0)+1);
                }

            }
        }
       System.out.print(map);
        


        sc.close();

    }
}
