public class MainEmpresa{
    public static void main(String[] args){
        Vendedor v = new Vendedor( "Ana Lopez", "1234", 1500000, 350000 );
        Gerente g = new Gerente("Pedro Ruiz","5678", 3000000, 8000000);
           AprendizSena a = new AprendizSena("Luis Mora", "9012", 1500000);

        v.mostrarInfo();
        System.out.println("=== VENDEDOR ===");
        g.mostrarInfo();
        System.out.println("=== GERENTE ===");
        a.mostrarInfo();
System.out.println("=== APRENDIZ SENA ===");
        a.mostrarInfo();
    }  
    }
