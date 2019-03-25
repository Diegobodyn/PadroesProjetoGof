package estruturado;

import java.io.IOException;

public class ProcessaDefalt extends Processador {
	
	public ProcessaDefalt (Processador proximo) {
		super(proximo);	
	}
	
    public ProcessaDefalt() {
		// TODO Auto-generated constructor stub
	} 
	
	
	@Override
	protected byte[] processaConteudo(byte[] conteudo ) throws IOException {
		   return conteudo;
	   }

}
