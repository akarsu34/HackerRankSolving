package problemsolving;

public class DrawingBook {

    public static int pageCount(int n, int p) {
        // Write your code here
        if( p==1) return 0;
        if( (n %2==0) && (p % 2 ==0)) return 1;
        int startFromOnePage = p /2;
        int startFromEndPage = (n - p ) /2;
        return Math.min(startFromEndPage,startFromOnePage);
    }
}
