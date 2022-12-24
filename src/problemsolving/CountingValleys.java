package problemsolving;

import java.util.List;
import java.util.stream.Collectors;

public class CountingValleys {

    public static int countingValleys(int steps, String path) {

        // DDUUDDUDUUUD

        //
        List<Character> charList= path.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

        int step =0;
        int valleyCount =0;
        int level =0;
        for (Character c : charList) {
            if (c.equals('U')){
                step++;
            }else {
                step--;
            }

            if(level <0 && step==0){
                valleyCount++;
                level=0;
            }

            if(step<0){
                level =-1;
            }else if(step > 0){
                level = 1;
            }


        }

        return valleyCount;
    }


}
