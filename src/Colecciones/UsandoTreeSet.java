package Colecciones;


import java.util.TreeSet;

public class UsandoTreeSet {
    public static void main(String[] args) {
        //TreeSet
        TreeSet <Integer> treeSet = new TreeSet<>();

        treeSet.add(2);
        treeSet.add(5);
        treeSet.add(0);
        treeSet.add(-19);

        System.out.println(treeSet);
        System.out.println(treeSet.size());

    }
}
