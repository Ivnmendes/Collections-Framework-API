package application3;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	private List<Livro> livrosList;

	public CatalogoLivros() {
		this.livrosList = new ArrayList<>();
	}
	
	public void adicionarLivro(String titulo, String autor, int anoPubli) {
		this.livrosList.add(new Livro(titulo, autor, anoPubli));
	}
	
	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livrosPorAutor = new ArrayList<>();
		if(!this.livrosList.isEmpty()) {
			for(Livro l : livrosList) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
		}
		
		return livrosPorAutor;
	}
	
	public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> livrosPorIntervalo = new ArrayList<>();
		if(!this.livrosList.isEmpty()) {
			for(Livro l : this.livrosList) {
				if(l.getAnoPubli() >= anoInicial && l.getAnoPubli() <= anoFinal) {
					livrosPorIntervalo.add(l);
				}
			}
		}
		
		return livrosPorIntervalo;
	}
	
	public Livro pesquisaPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		if(!this.livrosList.isEmpty()) {
			for(Livro l : livrosList) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
					break;
				}
			}
		}
		
		return livroPorTitulo;
	}
}
