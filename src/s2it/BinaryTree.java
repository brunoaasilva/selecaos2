package s2it;

public class BinaryTree {
	private int valor;
	private BinaryTree left;
	private BinaryTree right;

	BinaryTree(int valor) {
		this.valor = valor;
	}
	
	BinaryTree() {
	}

	public BinaryTree getLeft() {
		return left;
	}

	public void setLeft(BinaryTree left) {
		this.left = left;
	}

	public BinaryTree getRight() {
		return right;
	}

	public void setRight(BinaryTree right) {
		this.right = right;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
}
