import Tacos.CustomTacoBox;
import Tacos.TripleTacoBox;

public class Main {
    public static void main(String[] args) {
        TripleTacoBox box1 = new TripleTacoBox();
        CustomTacoBox box2 = new CustomTacoBox(14);

        System.out.println(box1.tacosRemaining());
        box1.eat();
        System.out.println(box1.tacosRemaining());

        System.out.println(box2.tacosRemaining());
        box2.eat();
        System.out.println(box2.tacosRemaining());
    }
}
