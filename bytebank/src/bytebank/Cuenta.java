package bytebank;

public abstract class Cuenta {
	
	protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();
    
    private static int total;
    
    public Cuenta(int agencia, int numero) {
    	if(agencia <= 0) {
    		System.out.println("No se permite 0");
    		this.agencia = 1;
    	} else {
    		this.agencia = agencia;
    	}
    	
    	this.numero = numero;
    	System.out.println("Estoy creando la cuenta número " + this.numero);

        Cuenta.total ++;
        System.out.println("Se van creando "+total +" cuentas");
    }
    
    public abstract void depositar(double valor);
    
    public boolean retirar(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean transferir(double valor, Cuenta destino) {
        if(this.saldo >= valor) {
        	this.retirar(valor);
            destino.depositar(valor);
            return true;
        } else {
            return false;
        }
    }
    
    public double getSaldo() {
    	return this.saldo;    	
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int getAgencia() {
        return agencia;
    }
    
    public void setAgencia(int agencia) {
    	if(agencia > 0) {
    		this.agencia = agencia;    		
    	} else {
    		System.out.println("no están permitidos números negativos");
    	}        
    }
    
    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    
    public static int getTotal() {
        return Cuenta.total;
    }
}