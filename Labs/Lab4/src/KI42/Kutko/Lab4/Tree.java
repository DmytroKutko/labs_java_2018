package KI42.Kutko.Lab4;

public class Tree extends Plant implements TreeInter {

    public Tree() {
    }

    public Tree(String name, int height, String type) {
        super(name, height, type);
    }

    @Override
    public String getTimber() {
        String s = "Get timber from " + super.name + '\n';
        System.out.println(s);
        return s;
    }
}
