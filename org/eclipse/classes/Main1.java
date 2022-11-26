package org.eclipse.classes;
import java.util.ArrayList;
import java.util.ListIterator;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList();
        liste.add(0);
        liste.add(1);
        liste.add(2);
        liste.add(3);
        ListIterator<Integer> li = liste.listIterator();
            while (li.hasNext()) {
                Integer elt = li.next();
                if (elt.equals(0))
                li.remove();
            }
        System.out.println(liste);
        
    }
}