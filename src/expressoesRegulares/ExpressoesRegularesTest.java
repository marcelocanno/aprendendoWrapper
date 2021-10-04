package expressoesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {

	public static void main(String[] args) {
		
		//String regex = "ab";               // os requesitos a serem procurados
		//String testo = "abaaaba";         //  testo onde ser� procurado os dados
		//String regex = "aba";
		//String testo = "abababa";
		
		// meta caracteres
		// \d = vai encontrar todos os digitos
		// \D = vai encontrar tudo que n�o for digito
		// \s = vai procurar por espa�os em branco
		//  \t  \n \f \r
		// \S = encontrar caractere n�o � espa�o em branco
		// \w = vai encontrar caracteres de palavras de A-Z, a-z, digitos, _ ,
		// \W = vai encontrar tudo que n�o for palavra.
		// [] = vai encontrar o que est� dentro do ranger
		
		//  quantificadores
		//  ? zero ou uma ocorrencia
		//  * zero ou mais ocorrencia
		//  + uma ou mais ocorrencia
		//  {n,m} de n atpe m ocorrencias
		//  ( ) utilizado para agrupar em express�o.
		//  | utilizado para colocar ou.
		//  $ utilizado para fim de linha
		// o(v|c)o = procura onde come�a com o , onde tenha v ou o, tenha o // ovo ou oco
		// maca(rr|c)�o = macar�o ou macac�o. assim funciona agrupamento.
		//  . caracter coringa - pode ser substituido por qualquer caracter 1.3 = 1#3, 1*3, 1_3, etc
		//  ^ para excluir uma express�o que n�o quer - caracter de nega��o (^abc) vc n�o quer abc
		//  
		
		//String regex = "\\D";
		//String regex = "\\d";
		//String regex = "\\s";
		//String regex = "\\D";
		//String regex = "\\D";
		//String regex = "\\w";
		
		//int numeroHex = 0Xfff;
		
		//String regex = "0[xX]([0-9a-fA-F])"; // criterio de busca // expressoes regulares
		String regex ="[c58] [0x09 -fa]";             // criterio de busca
		String testo = "12 0x 0X 0xffabc 0x10g 0x1"; // onde ser� procurado
		
		
		
		//String testo = "abab45634abcd567ababba";
		
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(testo);
		
		System.out.println("testo : " + testo);
		System.out.println("indice : 0123456789101112131415121617181920");
		System.out.println("expressao : " + matcher.pattern());
		System.out.println("posicoes encontradas");
		while(matcher.find()) {
			System.out.println(matcher.start() + " " + matcher.group());
			System.out.print(matcher.start() + " ");
		}
			
			
		//System.out.println("--------------------------------------------------------");
		//System.out.println("--------------------------------------------------------");
		
	}

}
