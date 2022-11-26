import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
    ArrayList liste = new ArrayList();
    liste.add(0);
    liste.add(1);
    liste.add(2);
    liste.add(3);
        for(Object elt: liste) {
            if (elt.equals(0))
                liste.remove(elt);
        }
    }
}
    