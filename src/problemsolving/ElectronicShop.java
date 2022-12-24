package problemsolving;


public class ElectronicShop {
    public static void main(String[] args) {
        int[] a = new int[2];
        a[0]=3;
        a[1]=1;
        int[] b = new int[3];
        b[0]=5;
        b[1]=2;
        b[2]=8;

        getMoneySpent(a,b,10);


    }
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {

        int result =-1;
        for (int key : keyboards) {
            for (int dri :drives) {
                int sum = key + dri;
                if (sum > b)  continue;
                result = Math.max(result, sum);
            }
        }


        return result;

    }
}
