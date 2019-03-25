package observer;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public  abstract class GeradorArquivo {
	
	private Processador processador;
	
	private List<Observador> observadores;
	public GeradorArquivo(Processador processador) {
		this.processador = processador;
		this.observadores = new ArrayList<Observador>();
	}

	public final void gerarArquivo(String nome, Map<String, Object> propriedades)throws IOException{
		/*
		 * byte[] bytes = null; if (tipo.equals("PROPRIEDADES_CRIPTOGRAFADO")) {
		 * ProcessaPropriedadesCriptografado propCript = new
		 * ProcessaPropriedadesCriptografado(); bytes =
		 * propCript.processaPropriedadeCriptografado(propriedades); }else if
		 * (tipo.equals("XML_COMPACTADO")) { ProcessaXmlCompactado xml = new
		 * ProcessaXmlCompactado(); bytes = xml.processaXmlCompactado(propriedades); }
		 * else { System.out.println("Desconheço essa opção"); }
		 */
		String conteudo = gerarConteudo(propriedades);
		byte[] bytes = processador.processaConteudo(conteudo.getBytes());
		FileOutputStream fileout = new FileOutputStream(nome);
		fileout.write(bytes);
		fileout.close();
		notificar(nome, conteudo);
	}
	
	public void notificar(String nomeArquivo, String conteudo) {
		
		for (Observador observador : observadores) {
			observador.novoArquivoGerado(nomeArquivo, conteudo);
		}
	}
	
	public void addObservador(Observador observador) {
		this.observadores.add(observador);
	}
	
	//obrigo o método a exisistir nos filhos
	protected  abstract String gerarConteudo(Map<String, Object> propriedades);
	
	
	//template method
	//classe mae que tem um comportamento geral, quando precisa de algo, os filhos injetam o comportamento necessário;
	

	
}
