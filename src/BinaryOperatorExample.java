import java.util.List;
import java.util.function.BinaryOperator;
import java.util.Arrays;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,9);

        BinaryOperator<Integer> somar = Integer::sum;

        int resultado = numeros.stream()
        .reduce(0, Integer::sum);

        System.out.println("A soma dos resultados é:" + resultado);
    }
}
