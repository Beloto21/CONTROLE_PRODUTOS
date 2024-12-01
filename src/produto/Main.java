package produto;

import produto.Produto;
import produto.ProdutoAlimenticio;
import produto.ProdutoVestuario;

public class Main {
    public static void main(String[] args) {
        // Instância do Produto
        Produto produto = new Produto("Garrafa", 8.40, 18.50);
        System.out.println("Lucro do produto: R$" + produto.calcularLucro());
        produto.salvar(); // Salvar no banco

        // Instância do ProdutoAlimenticio
        ProdutoAlimenticio produtoAlimenticio = new ProdutoAlimenticio("Banana", 7.10, 16.50, "2024-06-21", "1 cacho");
        System.out.println("Lucro do produto alimentício: R$" + produtoAlimenticio.calcularLucro());
        produtoAlimenticio.salvar(); // Salvar no banco

        // Instância do ProdutoVestuario
        ProdutoVestuario produtoVestuario = new ProdutoVestuario("Calça", 55.00, 99.00, "42", "Preto", "Linho");
        System.out.println("Lucro do produto de vestuário: R$" + produtoVestuario.calcularLucro());
        produtoVestuario.salvar(); // Salvar no banco

        System.out.println("Testes de inserção concluídos.");
    }
}
