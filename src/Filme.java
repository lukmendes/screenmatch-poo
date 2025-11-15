public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDeAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica() {
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    void avalia(double nota) {
        somaDeAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double retornaMedia() {
        return somaDeAvaliacoes / totalDeAvaliacoes;
    }
}
