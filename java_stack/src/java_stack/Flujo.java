package java_stack;

public class Flujo {

	public static void main(String[] args) {
		
		System.out.println("Inicio del main");
        metodo1();
        System.out.println("Fin del main");
    }

    private static void metodo1() {
        System.out.println("Inicio del metodo1");
        metodo2();
        System.out.println("Fin del metodo1");
    }

    private static void metodo2() {
        System.out.println("Inicio del metodo2");
        ArithmeticException aException = new ArithmeticException();
        
        try {
        	throw aException;			
		} catch (Exception exception) {
			System.out.println("Atrapo excepciones");
			exception.printStackTrace();			
		}        
        
        /*
        for(int i = 1; i <= 5; i++) {
        	System.out.println(i);        	
            
            try { // intenta esto
            	if(i == 3) {
            		int num = 0;
                    int resultado = i / num;				
                    System.out.println(resultado);            		
            	}            	
            	
            	String test = null;
            	System.out.println(test.toString());
			} catch (ArithmeticException | NullPointerException exception) { // atrapa el error
				System.out.println("Atrapo excepciones");
				System.out.println(exception.getMessage());
				exception.printStackTrace();
			}
        }
        */
        
        System.out.println("Fin del metodo2");
    }
}