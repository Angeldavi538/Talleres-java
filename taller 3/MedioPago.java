public abstract class MedioPago {

    protected double monto;

    public MedioPago(double monto) {
        this.monto = monto;
    }

    // Abstracto: cada medio lo procesa distinto
    public abstract void procesarPago();

    // Concreto: igual para todos
    public void mostrarMonto() {
        System.out.println("Monto a pagar: $" + monto);
    }
}
