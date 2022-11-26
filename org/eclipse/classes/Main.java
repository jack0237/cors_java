package org.eclipse.classes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(3);
        list.add("Bonjour");
        list.add(3.5);
        list.add('c');
        for(int i = 0; i < list.size(); i++){
            System.out.println("valeur d’indice " + i + " : " + list.get(i));
        }
    }
}
