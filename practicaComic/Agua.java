public class Agua extends Thread implements Ser{
    private String estado="Liquido";
    private String nombre;
    public Agua(String nombre){
        this.nombre=nombre;
    }
    public void cambiarEstado(String estado){
        this.estado=estado;
    }
    public String getEstado() {
        return estado;
    }
    public void run(){
        System.out.println("Corriendo.........");
    }
    public String getNombre(){
        return nombre;
    }
    public String contarHistoria(String contar){
        return this.getNombre()+": "+contar;
    }
}
