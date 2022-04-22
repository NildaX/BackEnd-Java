public class Flor extends Thread implements Ser {
    private String estado="Capullo";
    private String nombre;
    public Flor(String nombre){
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
