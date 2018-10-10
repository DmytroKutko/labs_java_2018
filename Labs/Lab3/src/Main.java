import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("PlantDoc.txt");
        PrintWriter fout = new PrintWriter(file);

        Plant plant = new Plant("Oak", 1000, "Tree");
        fout.write(plant.toString() + '\n' + '\n');

        fout.write(plant.grow() + '\n');
        fout.write(plant.getResources() + '\n');
        fout.write(plant.photosynthesis() + '\n');
        fout.write(plant.exploreThePlant() + '\n');
        fout.write(plant.reproduction() + '\n');
        fout.write(plant.waterAbsorption() + '\n');
        fout.write(plant.plantTransplant() + '\n');
        fout.write(plant.regeneration() + '\n');
        fout.write(plant.solarEnergyAbsorption() + '\n');
        fout.write(plant.evolve() + '\n');


        fout.flush();
        fout.close();
    }
}
