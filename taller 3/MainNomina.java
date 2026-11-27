public class MainNomina {
    public static void main(String[] args) {

        EmpleadoFijo ef = new EmpleadoFijo("Ana Rios", "1111", 2200000);
        EmpleadoPorHoras eh = new EmpleadoPorHoras("Luis Mora", "2222", 80, 15000);
        EmpleadoFreelance fl = new EmpleadoFreelance("Sara Gil", "3333", 3, 400000);
        EmpleadoFreelance sinProyectos = new EmpleadoFreelance("Tomas Paz", "4444", 0, 400000);

        ef.mostrarRecibo();
        System.out.println("---");
        eh.mostrarRecibo();
        System.out.println("---");
        fl.mostrarRecibo();
        System.out.println("---");
        sinProyectos.mostrarRecibo();
    }
}
