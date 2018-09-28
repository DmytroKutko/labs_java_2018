import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Клас Lab2KutkoKI42 реалізує приклад програми до лабораторної роботи №2
 *
 * @author Dmytro_Kutko
 * @version 1.0
 * @since version 1.0
 */

public class Lab2KutkoKI42 {

    /**
     *Статичний метод main є точкою входу програми
     *
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {

        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        System.out.println("Enter symbol: ");
        String symbol = sc.next();
        sc.close();

        int point = size;
        String[][] arr = new String[size][size];


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < point; j++) {
                arr[i][j] = symbol;
                System.out.print(arr[i][j] + ' ');
                fout.print(arr[i][j] + ' ');
            }
            point -= 1;
            System.out.print('\n');
            fout.print('\n');
        }
        fout.flush();
        fout.close();
    }
}