import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x;
        double y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число x:");
        x=scanner.nextInt();
        double y0 = Math.abs(x);
        double y1 = Math.sqrt(y0);
        double y2 = y1 + 1;
        double y3 = y1 / y2;
        double y4 = Math.asin(Math.pow(y3,5));
        double y5 = Math.pow(x,2)+1;
        double y6 = Math.log(y5)/5;
        double y7 = Math.exp(y6);
        double y8 = Math.pow(y0,Math.cos(x));
        double y9 = Math.pow(2,Math.sin(x));
        double y10 = (y8+y9)/Math.log(2);
        double y11= Math.log(y10);
        //double e =Math.log(Math.pow(2,Math.sin(x)+Math.pow(Math.abs(x),Math.cos(x))))/Math.log(2);
        y= y4+y7+y11;
        
      System.out.print(y);
        if ((x<=5 && x>=-5) && (y>=5 && y<=10))
        System.out.println("yes");
    else System.out.println ("no");
    }


}
