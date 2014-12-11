public class ParserDemo {

	public static void main(String[] args) {
		String file2 = "C:\\Users\\Kyle\\Desktop\\prog2.jay";
		TokenStream tStream = new TokenStream(file2);
		System.out.println("test1");
		ConcreteSyntax cSyntax = new ConcreteSyntax(tStream);
		System.out.println("test2");
		Program p = cSyntax.program();
		System.out.println(p.display());
		System.out.println("test");
	}

}
