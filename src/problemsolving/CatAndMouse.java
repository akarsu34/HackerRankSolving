package problemsolving;

public class CatAndMouse {

    public static void main(String[] args) {
        System.out.println(catAndMouse(1,2,3));
    }
    static String catAndMouse(int x, int y, int z) {
        int catAPosition = (x -z) <0 ?(x-z) * -1 : (x-z);
        int catBPosition = (y -z) <0 ?(y-z) * -1 : (y-z);

       return (catAPosition < catBPosition) ? "Cat A" : (catAPosition > catBPosition  ? "Cat B" : "Mouse C");

    }
}
