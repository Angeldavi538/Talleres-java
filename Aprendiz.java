public class Aprendiz {
    private String documento;
    private String nombre;
    private int edad;
    private double notaFinal;
    private String aprobo;

public Aprendiz(String documento, String nombre) {
    this.documento = documento;
    this.nombre = nombre;
    this.edad = 0;
    this.notaFinal= 0.0;
}
public String getDocumento() {return documento;}
public String getNombre() {return nombre;}
public int getEdad() {return edad;}
public double getNotaFinal(){return notaFinal;}
public String getAprobo(){return aprobo;}
public void setNotaFinal(double notaFinal){
    if (notaFinal >= 0.0 && notaFinal <= 5.0){
        this.notaFinal = notaFinal;
        
    } else {
        System.out.println("nota invalida. debe ser entre 0.0 y 5.0");
    }
}
public void setEdad(int edad){
    if  (edad >= 0 && edad <=100){
        this.edad = edad;
    }else {
        System.out.println("edad invalida. debe ser entre 0 y 100.");
    }
}
public boolean aprobo() {
    return notaFinal >= 3.5;

    
}
}