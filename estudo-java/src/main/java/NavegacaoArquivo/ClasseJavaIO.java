package NavegacaoArquivo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ClasseJavaIO {

	public static void main(String[] args) {
		
		File file = new File("C:/docXTI/DOC.txt");
		try {
			if(file.createNewFile()){// metodo cria um arquivo vazio que nao existe 
				System.out.println("doc criado");
			}
			else {
				System.out.println("arquivo ja criado");
			}
		}
		catch(IOException e) {
			
			System.out.println("nao criou");
			e.printStackTrace();
			
			
		}
		String fileNome = "arquivo_aula.txt";
		String naosei = System.getProperty("user.dir");
		String filepath = "";
		filepath = naosei+File.pathSeparator+fileNome;
		System.out.println("caminho final" +filepath);
		
		File f = new File(filepath);
	try {	if(f.createNewFile()){
			System.out.println("arquivo criado");
		}
		else {
			System.out.println("arquivo jacriado");
		}
	}
	catch(IOException s) {
		System.out.println("faca a ocorrencia");
		s.printStackTrace();
		
	}
	try {
	File a = new File("C:/HTML/imagem.txt");
	FileWriter b = new FileWriter(a);
	System.out.println("arquivo show");
	}
	catch(IOException d) {
		d.printStackTrace();
		
	}
	}

}
