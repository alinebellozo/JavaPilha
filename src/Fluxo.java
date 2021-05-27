public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();
        } catch (Exception ex) { // ArithmeticException é uma classe, e ex é uma referência
        	String msg = ex.getMessage(); // getMessage() é para descobrir qual é a exceção
        	System.out.println("Exception " + msg);
        	ex.printStackTrace(); // usado para mostrar o "rastro", os locais por onde o código passou
        }	
        System.out.println("Fim do main");
    }
    
    private static void metodo1() throws MinhaExcecao {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao {
        System.out.println("Ini do metodo2");
        throw new MinhaExcecao("ops, algo de errado não deu certo!");
       
        //System.out.println("Fim do metodo2");
    }
}
