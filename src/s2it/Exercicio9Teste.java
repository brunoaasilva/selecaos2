package s2it;

public class Exercicio9Teste {

	public static void main(String[] args) {
		
		Exercicio9 arvore = new Exercicio9();
		
		arvore.adicionarNo(5);
		arvore.adicionarNo(8);
		arvore.adicionarNo(3);
		arvore.adicionarNo(2);
		
		System.out.print(arvore.somaNodosSubsequentes(arvore.raiz));

	}

}
