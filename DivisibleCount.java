public class DivisibleCount {
    public static int countDivisible(int x, int y, int k) {
        // Asegurarse de que k no sea cero para evitar división por cero
        if (k == 0) {
            return 0;
        }

        // Calcular el primer número divisible por k en el rango [x..y]
        int firstDivisible = (x % k == 0) ? x : x + (k - x % k);

        // Calcular el último número divisible por k en el rango [x..y]
        int lastDivisible = (y % k == 0) ? y : y - y % k;

        // Si no hay números divisibles en el rango, retornar 0
        if (firstDivisible > y || lastDivisible < x) {
            return 0;
        }

        // Calcular la cantidad de números divisibles por k en el rango
        return (lastDivisible - firstDivisible) / k + 1;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int x = 6;
        int y = 11;
        int k = 2;
        System.out.println(countDivisible(x, y, k)); // Debería imprimir 3
    }
}