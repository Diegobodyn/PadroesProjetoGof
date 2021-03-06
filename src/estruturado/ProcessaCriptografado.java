package estruturado;

public class ProcessaCriptografado extends Processador {
	
	public ProcessaCriptografado(Processador proximo) {
		super(proximo);	
	}
	
	 public ProcessaCriptografado() {
			
		}

	@Override
	public byte[] processaConteudo(byte[] bytes) {
		byte[] newBytes = new byte[bytes.length];
		for (int i = 0; i<bytes.length;i++) {
			newBytes[i] = (byte)((bytes[i]+10) % Byte.MAX_VALUE);
		}
		return newBytes; 
	}
	
}
