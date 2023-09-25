package app3;

public class program {

	public static void main(String[] args) {
		CatalogoLivros catalogoLivros = new CatalogoLivros();
		catalogoLivros.adicionarLivro("Livro1", "Autor 1", 2020);
		catalogoLivros.adicionarLivro("Livro1", "Autor 2", 2021);
		catalogoLivros.adicionarLivro("Livro2", "Autor 2", 2022);
		catalogoLivros.adicionarLivro("Livro3", "Autor 3", 2023);
		catalogoLivros.adicionarLivro("Livro4", "Autor 4", 1999);
		
		System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
		System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2020, 2023));
		System.out.println(catalogoLivros.pesquisaPorTitulo("Livro1"));
	}

}
