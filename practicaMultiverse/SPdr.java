public class SPdr implements Spiderman{
    private String nombre;
    private String universo;
    public SPdr(String nombre, String universo){
        this.nombre=nombre;
        this.universo=universo;
    }
    public String getNombre(){
        return nombre;
    }
    public String getUniverso(){
        return universo;
    }
    public void descripcion(){
        System.out.println(this.getNombre()+ " del universo: "+ this.getUniverso()+" ");
    }
    public void treparMuros(){
        System.out.println("Peni trepa muros gracias al traje de SP//DR");
    }
    public void sentidoAracnido(){
        System.out.println("Su sentido arácnido proviene de la araña radiactiva que esta en el traje");
    }
    public void lanzarRedes(){
        System.out.println("Lanza redes a traves de la armadura");
    }
    public void poderEspecial(){
        System.out.println(" Su armadura está compuesta de varias capas de metal creando un traje flexible, \n resistente y que otorga gran protección.");
    }
}
