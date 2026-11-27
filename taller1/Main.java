public class Main {
    public static void main(String[] args) {
   
        CuentaBancaria cuenta1 = new CuentaBancaria ("123456789", "Juan Perez", 100000.0);
            

        String CuentaTitular = cuenta1.getNumeroCuenta();
        System.out.println (CuentaTitular);
        
    }
    
}
