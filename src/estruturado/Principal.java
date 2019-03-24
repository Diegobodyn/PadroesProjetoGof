package estruturado;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Principal {
	
	public static void main(String args) throws IOException {
		Map<String, Object> mapa = new HashMap<>();
		mapa.put("nome", "Diego Henrique Silva");
		mapa.put("idade", 30);
		
		GeradorArquivo gerador = new GeradorArquivoPropriedadesCriptografado();
		gerador.gerarArquivo("c:\\Gerador\\Cripto.txt", mapa);
		
		GeradorArquivo gerador1 = new GeradorArquivoPropriedadesCriptografado();
		gerador1.gerarArquivo("c:\\Gerador\\XML.zip", mapa);		
			
	}

}
