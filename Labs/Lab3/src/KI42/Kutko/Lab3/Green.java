package KI42.Kutko.Lab3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class Herb {

    private String name;
    private String type;
    private int size;
    private String plateTime;

    public Herb() {
    }

    public Herb(String name, String type, int size) {
        this.name = name;
        this.type = type;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getPlateTime() {
        return plateTime;
    }

    public void setPlateTime(String plateTime) {
        this.plateTime = plateTime;
    }

    public void plateTheHerb() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        this.plateTime = dateFormat.format(date);
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", size=" + size +
                ", plateTime=" + plateTime;
    }
}
