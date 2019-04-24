package lexico;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;

public class Teste2 {

	public static void main(String[] args) throws IOException {

		int cont = 0;
		String texto = lerArquivo("TextoVerificacao.txt");
		Lexer lexer = new Lexer(new StringReader(texto));
		String resultado = "";

		while (true) {
			Token token = lexer.yylex();
			if (token == null) {

				System.out.println(resultado);

				return;
			}
			// cases para mostrarmos a saida dos tokens
			switch (token) {

			case ERROR:
				cont++;
				resultado = resultado + "Erro na linha " + cont + ": Símbolo não reconhecido \n";
				break;

			case ID:
				cont++;
				resultado = resultado + "Linha: " + cont + "<ID> " + lexer.lexeme + "\n";
				break;

			case NUMERO:
				cont++;
				resultado = resultado + "Linha: " + cont + "<Numero> " + lexer.lexeme + "\n";
				break;

			case SIMBOLO_ESPECIAL:
				cont++;
				resultado = resultado + "Linha: " + cont + "<Simbolo_Especial>" + lexer.lexeme + "\n";
				break;

			case OP_RELACIONAL:
				cont++;
				resultado = resultado + "Linha: " + cont + "<Operador_Relacional> " + lexer.lexeme + "\n";
				break;

			case OP_ARITMETICO:
				cont++;
				resultado = resultado + "Linha: " + cont + "<Operador_Atitmetico> " + lexer.lexeme + "\n";
				break;

			case NUMERO_DECIMAL:
				cont++;
				resultado = resultado + "Linha: " + cont + "<Numero_decimal>" + lexer.lexeme + "\n";
				break;

			case OP_LOGICO_OR:
				cont++;
				resultado = resultado + "Linha: " + cont + "<Operador_Logico> " + lexer.lexeme + "\n";
				break;

			case OP_LOGICO_AND:
				cont++;
				resultado = resultado + "Linha: " + cont + "<Operador_Logico> " + lexer.lexeme + "\n";
				break;
			case OP_LOGICO_NOT:
				cont++;
				resultado = resultado + "Linha: " + cont + "<Operador_Logico> " + lexer.lexeme + "\n";
				break;

			case COMENTARIO:
				cont++;
				resultado = resultado + "Linha: " + cont + "<Comentario> " + lexer.lexeme + "\n";
				break;

			case OP_ATRIBUICAO:
				cont++;
				resultado = resultado + "Linha: " + cont + "<Operador_Atribuição> " + lexer.lexeme + "\n";
				break;

			case PR_IF:
				cont++;
				resultado = resultado + "Linha: " + cont + "<Palavra_Reservada> " + lexer.lexeme + "\n";
				break;

			case PR_INT:
				cont++;
				resultado = resultado + "Linha: " + cont + "<Palavra_Reservada> " + lexer.lexeme + "\n";
				break;

			case PR_VAR:
				cont++;
				resultado = resultado + "Linha: " + cont + "<Palavra_Reservada> " + lexer.lexeme + "\n";
				break;

			case PR_ELSE:
				cont++;
				resultado = resultado + "Linha: " + cont + "<Palavra_Reservada> " + lexer.lexeme + "\n";
				break;

			case PR_CHAR:
				cont++;
				resultado = resultado + "Linha: " + cont + "<Palavra_Reservada> " + lexer.lexeme + "\n";
				break;

			case PR_VOID:
				cont++;
				resultado = resultado + "Linha: " + cont + "<Palavra_Reservada> " + lexer.lexeme + "\n";
				break;

			case PR_PRNT:
				cont++;
				resultado = resultado + "Linha: " + cont + "<Palavra_Reservada> " + lexer.lexeme + "\n";
				break;

			case PR_PROC:
				cont++;
				resultado = resultado + "Linha: " + cont + "<Palavra_Reservada> " + lexer.lexeme + "\n";
				break;

			case PR_FLOAT:
				cont++;
				resultado = resultado + "Linha: " + cont + "<Palavra_Reservada> " + lexer.lexeme + "\n";
				break;

			case PR_WHILE:
				cont++;
				resultado = resultado + "Linha: " + cont + "<Palavra_Reservada> " + lexer.lexeme + "\n";
				break;

			case PR_RETURN:
				cont++;
				resultado = resultado + "Linha: " + cont + "<Palavra_Reservada> " + lexer.lexeme + "\n";
				break;
			default:
				cont++;
				resultado = resultado + "Linha: " + cont + "<" + lexer.lexeme + ">" + cont++;
				break;
			}

			// System.out.println(resultado);
		}

	}
	private static String lerArquivo(String arquivo) throws IOException {
		Scanner scanner = new Scanner(new File(arquivo));
	    scanner.useDelimiter("\\Z");
	    return scanner.next();
	}
	
}