import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Ola seja bem vindo";

        List<String> ListaSaudacoes = Stream.generate(() -> "Ola seja bem vindo")
        .limit(5)
        .toList();

        ListaSaudacoes.forEach(System.out::println);
    }
}
