package estruturado;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Principal {
	
	public static void main(String args) throws IOException {
		Map<String, Object> mapa = new HashMap<>();
		mapa.put("nome", "Diego Henrique Silva");
		mapa.put("idade", 30);
		
		GeradorArquivo gerador = new GeradorArquivo();
		gerador.gerarArquivo("c:\\Gerador\\Cripto.txt", mapa, "PROPRIEDADES_CRIPTOGRAFADO");
		
		GeradorArquivo gerador1 = new GeradorArquivo();
		gerador1.gerarArquivo("c:\\Gerador\\XML.zip", mapa, "XML_COMPACTADO");		
	}

}
