public class TypeCasting {
    public static void main(String[] args) {
        short x = 18;
        x = (short) (x * 5); // Need to cast the result back to short because multiplication might result in an int.
        System.out.println(x);
    }
}
