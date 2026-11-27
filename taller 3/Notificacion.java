public abstract class Notificacion {

    protected String destinatario;
    protected String mensaje;

    public Notificacion(String destinatario, String mensaje) {
        this.destinatario = destinatario;
        this.mensaje = mensaje;
    }

    // Abstracto: cada canal envia a su manera
    public abstract void enviar();

    // Concreto: comun a todos, las hijas lo llaman despues de enviar
    public void registrarEnvio() {
        System.out.println("[LOG] Notificacion enviada a: " + destinatario);
    }
}