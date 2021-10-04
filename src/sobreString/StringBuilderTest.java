package sobreString;

public class StringBuilderTest {

	public static void main(String[] args) {
		String s = "Uma frase comum";
		StringBuilder sb = new StringBuilder(16);
		sb.append("uma frase comum   ");
		sb.append("test");
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb.reverse());
		System.out.println(sb.delete(2,10));
		System.out.println(sb.insert(2,"a"));
		System.out.println(sb.insert(3, "  frase  "));
		
	}

}
