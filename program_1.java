import java.util.*;

public class program_1 {
   public static  class Calculator{
        double a,b;
        String oper;
        Calculator(double a,double b,String oper){
            this.a=a;
            this.b=b;
            this.oper=oper;
        }
        public double calculate(){
        switch(oper.toLowerCase()){
            case "add":
                return a+b;
             case "sub":
                return a-b;
             case "mul":
                return a*b;
            case "div":
                return a/b ;
            default:
                System.out.println("invaild operation");
                return Integer.MIN_VALUE;       
        }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        String oper=sc.next();
        Calculator c1=new Calculator(a, b, oper);

        double res=c1.calculate();
        System.out.println(res);
        sc.close();

    }
}
