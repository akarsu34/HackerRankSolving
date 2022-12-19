package problemsolving;

import java.util.Arrays;
import java.util.List;

public class MigratoryBirds  {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1 ,2 ,3 ,4 ,5 ,4 ,3 ,2 ,1 ,3 ,4);
        int i = migratoryBirds(list);
        System.out.println(i);
    }

    public static int migratoryBirds(List<Integer> arr) {

        int[] intArray = new int[6];
        Integer max =0;


        for (int i = 0; i < arr.size(); i++) {

            intArray[arr.get(i)]++;
            max = Math.max(max, intArray[arr.get(i)]);
        }

        for (int i = 0; i < intArray.length; i++) {
            if(max == intArray[i]){
                return i;
            }

        }
        return 0;

    }
}



