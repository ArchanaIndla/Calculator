import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println(" Enter value for a:");
       System.out.println("Enetr value for b:");
       double a=sc.nextDouble();       
       double b=sc.nextDouble();
       char operator;
       System.out.println("select the operator: +||-||*||/ ");
       operator=sc.next().charAt(0);
       switch (operator) {
        case '+':
            System.out.println(a+b);
            break;
        case '-':
            System.out.println(a-b);
            break;
        case '*':
            System.out.println(a*b);
            break;
        case '/':
            System.out.println(a/b);
            break;
        default:
            System.out.println("operator is not defined");
            break;
       }
       sc.close();
    }
}
