package KI42.Kutko.Lab6;

import java.io.*;
import java.util.Scanner;

public class Lab6 {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter file name: ");
        Scanner in = new Scanner(System.in);
        String fName = in.nextLine();
        PrintWriter fout = new PrintWriter(new File(fName));

        FileReader fr = new FileReader( "x.txt" );
        Scanner sc = new Scanner(fr);
        String value = sc.nextLine();
        fr.close();

        double x = Double.valueOf(value);
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
