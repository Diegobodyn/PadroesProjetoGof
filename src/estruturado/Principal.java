package estruturado;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Principal {
	
	public static void main(String[] args) throws IOException {
		Map<String,Object> mapa = new HashMap<>();
		mapa.put("nome ", "Diego Henrique Silva");
		mapa.put("idade ", 30);
		
		GeradorArquivo gerador = new GeradorArquivoPropriedades(new ProcessaCriptografado());
		gerador.gerarArquivo("c:\\Gerador\\Cripto.txt", mapa);
		
		GeradorArquivo gerador1 = new GeradorArquivoPropriedades(new ProcessaCompactado());
		gerador1.gerarArquivo("c:\\Gerador\\XML.zip", mapa);		
			
		GeradorArquivo gerador2 = new GeradorArquivoPropriedades(new ProcessaDefalt());
		gerador2.gerarArquivo("c:\\Gerador\\defalt.txt", mapa);
	}

}
