package estruturado;

import java.io.IOException;

public class ProcessaDefalt implements Processador {
	
	
	@Override
	public byte[] processaConteudo(byte[] conteudo ) throws IOException {
		   return conteudo;
	   }

}
