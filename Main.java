import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {

        Scanner str = new Scanner(System.in);

        double x;
        double y;
        System.out.print("Print x:");
        x = str.nextDouble();
        if (x < -1)
            y = pow(x, 6) * log10(abs(pow(6, x) - abs(pow((x - 5), x))));
        else if (x >= -1 & x < 1)
            y = sin(x / (1 - 2 * pow(x, 2)));
        else
            y = asin(1 / pow(x, 4));
        System.out.print("y(x)=");
        System.out.printf("%.2f", y);
    }
}
