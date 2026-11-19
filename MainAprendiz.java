public class MainAprendiz{
    public static void main(String[]args) {

        Aprendiz a = new Aprendiz("109237652", "pepito perez");
    
        a.setEdad(19);
        a.setNotaFinal(4.2);
        a.setNotaFinal(7.0);
    System.out.println("Aprendiz: " + a.getNombre());
    System.out.println("Edad: " + a.getEdad());
    System.out.println("NotaFinal: " + a.getNotaFinal());
    System.out.println("Aprobo? " + a.aprobo());
}
}