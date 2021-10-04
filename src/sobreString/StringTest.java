package sobreString;

public class StringTest {

	public static void main(String[] args) {
		
		String nome = "marcelo";
		nome = nome.concat("canno"); // nome += "canno"
		String nome2 = "marcelo";
		String nome3 = new String("Joel"); 
		
		// 1 variavel de referencia
		// 2 um objeto do tipo string
		// 3 uma string no pool de string
		
		System.out.println(nome);
		
		String teste = "  Marcelo  ";
		String teste2 = "  marcelo  ";
		System.out.println(teste.charAt(3));
		System.out.println(teste.equalsIgnoreCase(teste2));
		System.out.println(teste.length());
		System.out.println(teste.replace('M','r'));  // troca as letras
		System.out.println(teste2.replace('a', 'r')); // troca as letras
		System.out.println(teste.toLowerCase());  // tudo minusculo
		System.out.println(teste.toUpperCase());  // tudo maiusculo
		System.out.println(teste.substring(0, 3)); // conta os caracteres de 0 a 3
		System.out.println(teste.trim());  // elinima espaços na string
		
		
	}

}
