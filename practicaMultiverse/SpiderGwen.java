public class SpiderGwen implements Spiderman{
    private String nombre;
    private String universo;
    public SpiderGwen(String nombre, String universo){
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
        System.out.println("La araña radiactiva que pico a Gwen produjo una mutación en su cerebelo, como consecuencia ella puede controlar mentalmente el flujo de atracción interatómica (electrostática) entre el límite molecular de las superficies, así supera la repulsión normal de electrones y permite su increíble potencial de adhesión. ");
    }
    public void sentidoAracnido(){
        System.out.println("Spider-Woman posee un sentido extrasensorial o sentido arácnido que le avisa de los potenciales peligros inmediatos con una sensación de hormigueo en la parte posterior de la cabeza.");
    }
    public void lanzarRedes(){
        System.out.println("Ella es propietaria de lanza-telarañas que fueron creados y entregados por la luchadora contra el crimen retirada y magnate multimillonaria, Janet Van Dyne");
    }
    public void poderEspecial(){
        System.out.println("Tiene una agilidad mayor a cualquier otros Spiderman \n que le permite moverse con la garcia de una bailarina.");
    }
}
