package partition; /**
 * Created by sdhahri_ct on 1/30/2022.
 */
import java.util.ArrayList;

public class Partition {

    public static ArrayList<ArrayList<Integer>> getPartition (ArrayList<Integer> l, Integer t){

        ArrayList<ArrayList<Integer>> partitions = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> partition = new ArrayList<Integer>();

        int i=0,j=0,k=0;
        while (i<l.size())
        {
            partition.clear();
            for ( j = 0; j < t; j++)
            {
                if((j+i)<l.size())
                    partition.add(l.get(i+j));
            }
            partitions.add((ArrayList<Integer>) partition.clone());
            i+=t;
            k++;
        }
        return partitions;

    }
}
