import partition.Partition;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Partie démo I :");
        Partition partition = new Partition();
        ArrayList<Integer> liste = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        System.out.println("Liste : " + liste);
        int taille = 3;
        ArrayList<ArrayList<Integer>> listPartition = new ArrayList<ArrayList<Integer>>();
        for(int i = 1; i <= taille; i++){
            System.out.println("Taille : " + i);
            listPartition = partition.getPartition(liste, i);
            System.out.println(listPartition);
        }
    }
}
