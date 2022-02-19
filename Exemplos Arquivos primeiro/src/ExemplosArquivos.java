import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class ExemplosArquivos {

	public static void main(String[] args) {
		
		// escrita -- se o parametro for true, adiciona no final do arquivo, se for false, apaga o que ja existe
		try {
			FileWriter arquivo = new FileWriter("nomes.txt", true);
			
			arquivo.write("Orlewilson");
			arquivo.write("\r\n");
			arquivo.write("Indy");
			arquivo.write("\r\n");
			arquivo.write("Yago");
			arquivo.write("\r\n");
			arquivo.write("Diego");
			arquivo.write("\r\n");
			
			arquivo.close();
			
		} catch(Exception e){
			System.out.println(e);
		}
		
		// leitura
		try {
			FileReader arquivo2 = new FileReader("nomes.txt");
			
			BufferedReader buffer = new BufferedReader(arquivo2);
			
			String linha;
			while((linha = buffer.readLine()) != null) {
				System.out.println(linha);
			}
			
			arquivo2.close();
			
		} catch(Exception e){
			System.out.println(e);		
		}	
	}

}
