public class SpidermanMiles implements Spiderman{
    private String nombre;
    private String universo;
    public SpidermanMiles(String nombre, String universo){
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
        System.out.println("Miles trepamuros como toda una araña, de manera brusca");
    }
    public void sentidoAracnido(){
        System.out.println("Su sentido arácnido parece ser mucho mayor en comparación con el de Peter Parker.");
    }
    public void lanzarRedes(){
        System.out.println("Los lanza-Telarañas que lleva en los puños expulsan una sustancia pegajosa que tiene múltiples utilidades, como forma de desplazamiento, arma, o pegamento. Esta telaraña se disuelve aproximadamente una hora después de entrar en contacto con el aire. Estos fueron creados y usados por Peter Parker, los recibió de May Parker tras conocerlo");
    }
    public void poderEspecial(){
        System.out.println("Puede mezclarse con su entorno, lo que le permite acercarse sigilosamente a sus enemigos o, en algunos casos, huir de ellos. \n El efecto resultante se parece mucho al de la invisibilidad.");
    }
}
