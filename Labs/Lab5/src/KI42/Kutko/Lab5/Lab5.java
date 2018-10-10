package KI42.Kutko.Lab5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Enter file name: ");
        Scanner in = new Scanner(System.in);
        String fName = in.nextLine();
        PrintWriter fout = new PrintWriter(new File(fName));
        System.out.println("Enter variable x = ");

        String strX = in.next();
        double x = Double.valueOf(strX);
        double answer = Math.tan(x) / (3 * x);

        String expression = "tg(" + x + ") / (3 * " + x + ")";
        String strAnswer = String.valueOf(answer);
        fout.write(expression + " = " + answer);
        System.out.println(expression + " = " + strAnswer);

        fout.flush();
        fout.close();
        in.close();
    }
}
