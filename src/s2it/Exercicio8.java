package s2it;

public class Exercicio8 {

	public static void main(String[] args) {
		System.out.println(calcular(10256, 512));
		System.out.println(calcular(10256, 5));
		System.out.println(calcular(1, 512));
	}
	
	public static Integer calcular(Integer a, Integer b) {
		
		String stringC = "";
		
        char[] charsA = a.toString().toCharArray();
        char[] charsB = b.toString().toCharArray();
        
        int lengthA = charsA.length;
        int lengthB = charsB.length;
        int maiorNumero = lengthA > lengthB ? lengthA : lengthB;

        for (int x = 0; x < maiorNumero; x++) {
            if (lengthA > x) {
                stringC += String.valueOf(charsA[x]);
            }
            if (lengthB > x) {
                stringC += String.valueOf(charsB[x]);
            }
        }
        
        Integer c = new Integer(stringC);
        return  c > 1000000 ? -1 : c;
    }

}
