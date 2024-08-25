package entities;

public class Livro {
	public String titulo;
	public String autor;
	public double preco;
	public int quantidadeEmEstoque;	
	
	public double precoTotal() {
		return preco * quantidadeEmEstoque;
	}
	
	public int entradaLivroNoEstoque(int quantidadeEmEstoque ) {
		return this.quantidadeEmEstoque += quantidadeEmEstoque;
	}
	
	public int saidaLivroNoEstoque(int quantidadeEmEstoque ) {
		return this.quantidadeEmEstoque -= quantidadeEmEstoque;
	}
	
	public String toString() {
		return "Titulo: " +titulo +", Autor: " + autor + ", Preço R$" + String.format("%.2f", preco) +
				", Quantidade em estoque: " + quantidadeEmEstoque + " Unidades"
				 + "Preço: R$" + String.format("%.2f", precoTotal());
	}

}
