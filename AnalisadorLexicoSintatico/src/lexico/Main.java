package lexico;

import java.io.File;

public class Main {
	
public static void gerarLexer(String path) {
	
	File arquivo = new File(path);
	jflex.Main.generate(arquivo);
}

	public static void main(String[] args) {
		
		String path = "C:\\Users\\thiag_000\\Desktop\\Pastas\\lexer.flex";
		
		gerarLexer(path);
	}

}
