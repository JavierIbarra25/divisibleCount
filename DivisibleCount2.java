public class DivisibleCount2 {
    public static int countDivisible(int x, int y, int k) {
        if (k == 0) return 0; // Evitar división por cero
        if (k == 1) return y - x + 1; // Todos los números son divisibles por 1
        return (y / k) - ((x - 1) / k) + (x == 0 ? 1 : 0);
    }

    public static void main(String[] args) {
        int x = 0;
        int y = 10;
        int k = 1;
        System.out.println(countDivisible(x, y, k)); // Imprime 11
    }
}