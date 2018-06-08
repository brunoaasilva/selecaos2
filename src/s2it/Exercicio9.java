package s2it;

public class Exercicio9 {

	BinaryTree raiz;

	int somaNodosSubsequentes = 0;

	public void adicionarNo(int valor) {
		BinaryTree binaryTree = new BinaryTree(valor);
		if (raiz == null) {
			raiz = binaryTree;
		} else {
			BinaryTree binaryTreeTemp = raiz;
			BinaryTree pai;
			while (true) {
				pai = binaryTreeTemp;
				if (valor < binaryTreeTemp.valor) {
					binaryTreeTemp = binaryTreeTemp.left;
					if (binaryTreeTemp == null) {
						pai.left = binaryTree;
						return;
					}
				} else {
					binaryTreeTemp = binaryTreeTemp.right;
					if (binaryTreeTemp == null) {
						pai.right = binaryTree;
						return;
					}
				}
			}
		}
	}

	public int somaNodosSubsequentes(BinaryTree binaryTree) {
		if (binaryTree == null) {
			return 0;
		}else if (binaryTree == raiz) {
			somaNodosSubsequentes = somaNodosSubsequentes(binaryTree.left)
					+ somaNodosSubsequentes(binaryTree.right);
		} else {
			somaNodosSubsequentes = somaNodosSubsequentes(binaryTree.left) 
					+ somaNodosSubsequentes(binaryTree.right)
					+ binaryTree.valor;
		}
		return somaNodosSubsequentes;
	}

	class BinaryTree {
		int valor;
		BinaryTree left;
		BinaryTree right;

		BinaryTree(int valor) {
			this.valor = valor;
		}
	}

}
