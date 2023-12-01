import Operation.Addition;
import Operation.Maximum;

public class ADD {
    public static void main(String[] args) {
        Addition addObj = new Addition();
        Maximum maxObj = new Maximum();
        int sum = addObj.add(5, 3);
        float difference = addObj.subtract(7.5f, 2.3f);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        maxObj.max(10, 8);
    }
}
