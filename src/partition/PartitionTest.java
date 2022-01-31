package partition;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by sdhahri_ct on 1/30/2022.
 */
public class PartitionTest {
    @org.junit.Test
    public void getPartition() throws Exception {
        ArrayList<Integer> simpleListe = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>> ();
        int length= 5;
        int part = 2;
        for (int i = 1; i <= length; i++) {
            simpleListe.add(i);
        }
        int j = 1;
        while( j <= length) {
            if(j+1 < length){
                result.add(new ArrayList<Integer>(Arrays.asList(j,j+1)));
                j=j+part;
            }else{
                result.add(new ArrayList<Integer>(Arrays.asList(j)));
                j++;
            }
        }
        assertEquals(result, Partition.getPartition(simpleListe, part));
    }

}