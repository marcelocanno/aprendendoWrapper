package sobreString;

public class StringPerformanceTest {

	public static void main(String[] args) {
		
		long inicio = System.currentTimeMillis();
		concatString(1000);
		long fim = System.currentTimeMillis();
		System.out.println("tempo gasto String : " + (fim-inicio) + "ms");
		
		inicio = System.currentTimeMillis();
		concatString(1000);
		fim = System.currentTimeMillis();
		System.out.println("tempo gasto StringBuilder : " + (fim-inicio) + "ms");
		
		inicio = System.currentTimeMillis();
		concatString(1000);
		fim = System.currentTimeMillis();
		System.out.println("tempo gasto StringBuffer : " + (fim-inicio) + "ms");
	}
		// mudança de performance entre String e StringBuilder
		// usando Builder a execução fica mais rapida
		// menos espaço de memoria

	private static void concatString(int tam) {
		String string = "";
		for(int i = 0;  i < tam; i++) {
			string +=i;
		}
		
	}
	private static void concatStringBuider(int tam) {
		StringBuilder ab = new StringBuilder(tam);
		for(int i = 0;  i < tam; i++) {
			ab.append(i);
		}
	}
		// outra StringBuffer - mesma operação de StringBuilder
		// métodos são sincronizados, são protegidos de multiplas treeads
	
	private static void concatStringBuffer(int tam) {
		StringBuffer ab = new StringBuffer(tam);
		for(int i = 0;  i < tam; i++) {
			ab.append(i);
		}
	}

}
