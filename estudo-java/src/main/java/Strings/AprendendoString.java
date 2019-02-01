package Strings;

public class AprendendoString {

	public static void main(String[] args) {
		// quando se compara string variavel simples e variavel de obejteto podem ter um msm valor
		// mais na comparaçao da false, devido a referencia ser diferente
		
		//Array de String
		String[] m= {"A","B","C"};
		for(int g=0;g<m.length;g++) {
		System.out.println(m[g]); 
		}
		// PARA REALIZAR SOMA TEM K COLOCAR NUMERO EM PARENTESE
		String s= "java " + (2+2);
		String d = "String " + s;
		//System.out.println(d);
		
		String a = String.valueOf(1);
		//System.out.println(a);
		// METODOS CHARAT RETORNA UM CHAR DA STRING,CONCAT: UNE AS STRING,EQUaLS COMPARA UMA STRING DA OUTRS FALSE OU TRUE
		String b = "java aprendendo java todo dia";
		for(int i=0;i<b.length();i++) {
		System.out.println(b.charAt(i) + b.concat(b) + b.equals(b));
			
		}
		// EqualsIgnoreCase() igggnora maiuscula o minuscula.
		//  LENGTH:RETORNA AS POSICOES DA STRING
		String vazia = new String("CHHEIA");
		System.out.println(vazia.length());
		
		// METODO SUB STRING RETORNA UMA PARTE DA STRING
		String v = "Usando  método subStringg";
		System.out.println(v.substring(10));
		
		// METODO toLowerCase() retorna caracterto caixa alta para caixa baixa;
		// Metodo toString retorna o valor da String;
				
		String w = new String("RETORNA");
		System.out.println(w.toLowerCase()+" "+ w.toString());
		
		// Metodo toUpperCase() caixa baixa para caixa alta
			String h = "fabiana santos       ";
			System.out.println(h.toUpperCase());
			
		// Metodo trim() retira os espacos em braco;
		System.out.println(h.trim());
		
		//Metodo raplace() pega a primeira a letra  e sustitui pela outra letra
		String cao = "viralata";
		System.out.println(cao.replace('a', 'A')); // virAlAtA
	}
 
}
