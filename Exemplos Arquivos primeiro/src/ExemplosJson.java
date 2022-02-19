import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ExemplosJson {

	public static void main(String[] args) {
		// criação
		JSONObject nomesAlunos = new JSONObject();
		
		nomesAlunos.put("aluno1", "rodrigo");
		nomesAlunos.put("aluno2", "indy");
		nomesAlunos.put("aluno3", "yago");
		
		JSONArray mensagens = new JSONArray();
		mensagens.add("ola");
		mensagens.add("turma");
		mensagens.add("19/02/2022");
		
		nomesAlunos.put("mensagens", mensagens);
		
		try {
			FileWriter arquivoJson = new FileWriter("exemplo.json", false);
			arquivoJson.write(nomesAlunos.toJSONString());
			arquivoJson.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		//leitura

	}

}
