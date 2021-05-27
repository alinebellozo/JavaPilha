
public class MinhaExcecao extends Exception { //checked, porque estende diretamente de Exception, não de RuntimeException

	public MinhaExcecao(String msg) {
		super(msg);
	}
}
