package functional_interface.examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */
public class SupplierExample {
  public static void main(String[] args) {
    // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
    Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";


    // Usar o Supplier para obter uma lista com 5 saudações
    List<String> listaSaudacoes1 = Stream.generate(saudacao)
        .limit(5)
        .toList();

    List<String> listaSaudacoes2 = Stream.generate(() -> "Hello world!")
            .limit(3)
            .toList();

    // Imprimir as saudações geradas
    listaSaudacoes1.forEach(System.out::println);
    listaSaudacoes2.forEach(System.out::println);
  }
}
