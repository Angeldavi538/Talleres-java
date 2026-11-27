 public class Animal{
    protected String nombre;
    protected int edad;
 
   public Animal(String nombre, int edad){
    this.nombre = nombre;
    this.edad = edad;
 }
    public void comer(){
        System.out.println(nombre + " esta comiendo.");
    }
       public void dormir(){
        System.out.println(nombre + " esta dormido.");
       }
         public void hacerSonido() {
            System.out.println(nombre + "emite sonido.");
         }}
           