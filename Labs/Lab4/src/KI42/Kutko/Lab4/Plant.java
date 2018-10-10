package KI42.Kutko.Lab4;

/**
 * Class Plant
 * has parameters : name, height and type
 */
public abstract class Plant {

    protected String name;
    protected int height;
    protected String type;

    /**
     * Plant grows
     *
     * @return String
     */
    public String grow() {
        this.height++;
        String s = "Now height = " + this.height + '\n';
        System.out.println(s);
        return s;
    }

    /**
     * Get resources from plant
     *
     * @return String
     */
    public String getResources() {
        String s = "You have collected resources from " + this.name + '\n';
        System.out.println(s);
        return s;
    }

    /**
     * Plant make photosynthesis
     *
     * @return String
     */
    public String photosynthesis() {
        String s = this.name + " converts carbon dioxide into oxygen\n";
        System.out.println(s);
        return s;
    }

    /**
     * Explore the plant
     *
     * @return String
     */
    public String exploreThePlant() {
        String s = "Info about plant:\n" + this.toString() + '\n';
        System.out.println(s);
        return s;
    }

    /**
     * Plant make reproduction
     *
     * @return String
     */
    public String reproduction() {
        String s = this.name + " creating new plant \n";
        System.out.println(s);
        return s;
    }

    /**
     * The plant absorbs water
     *
     * @return String
     */
    public String waterAbsorption() {
        String s = this.name + " absorbs water\n";
        System.out.println(s);
        return s;
    }

    /**
     * Transplant the plant
     *
     * @return String
     */
    public String plantTransplant() {
        String s = "You transplant " + this.name + '\n';
        System.out.println(s);
        return s;
    }

    /**
     * Plant regeneration
     *
     * @return String
     */
    public String regeneration() {
        String s = this.name + " regenerate\n";
        System.out.println(s);
        return s;
    }

    /**
     * Plant absorption of solar energy
     *
     * @return String
     */
    public String solarEnergyAbsorption() {
        String s = this.name + " absorbs solar energy\n";
        System.out.println(s);
        return s;
    }

    /**
     * The plant evolves
     *
     * @return String
     */
    public String evolve() {
        String s = this.name + " evolves";
        System.out.println(s);
        return s;
    }

    /**
     * Empty constructor
     */
    public Plant() {
    }

    /**
     * Param constructor
     *
     * @param name
     * @param height
     * @param type
     */
    public Plant(String name, int height, String type) {
        this.name = name;
        this.height = height;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Overrided method, returns info about plant
     *
     * @return
     */
    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", height=" + height +
                ", type='" + type + '\'';
    }
}
