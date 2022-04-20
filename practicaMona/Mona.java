public class Mona {
    private String nombre;
    private String personaje;
    private String accesorios;
    private int numero;
    public Mona(String nombre, String personaje, String accesorios, Integer numero){
        this.nombre=nombre;
        this.personaje=personaje;
        this.accesorios=accesorios;
        this.numero=numero;
    }
    public String getNombre(){
        return nombre;
    }
    public String getPersonaje(){
        return personaje;
    }
    public String getAccesorios(){
        return accesorios;
    }
    public Integer getNumero(){
        return numero;
    }
    public void realizarActividad(){
        System.out.println("Siendo un octogato......");
    }
}
