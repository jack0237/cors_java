import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList liste = new ArrayList();
        liste.add(0);
        liste.add("bonjour");
        liste.add(2);
        liste.remove(1);
        liste.set(1, "bonsoir");
        for(Object elt : liste) {
            System.out.print(elt + " ");
        }
    }
}

