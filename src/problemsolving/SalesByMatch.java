package problemsolving;

import java.util.Arrays;
import java.util.List;

public class SalesByMatch {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1 ,1 ,3 ,1 ,2 ,1 ,3 ,3 ,3 ,3);
        int i = sockMerchant(list);
        System.out.println(i);
    }
    public static int sockMerchant(List<Integer> ar) {


        int pair =0;
        int count =1;
        for (int i = 0; i < ar.size(); i++) {

            int value = ar.get(i);

            if(ar.get(i) !=0){
                for (int j = i+1; j < ar.size(); j++) {

                    int secondValue= ar.get(j);

                    if(value == secondValue){
                        count++;
                        ar.set(j,0);
                    }
                }

                pair += count /2;
                count =1;
            }

        }



        return pair;
    }
}
