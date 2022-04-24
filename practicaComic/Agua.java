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
    public void run() {
        try {
            Thread.sleep(12000);
            this.contarHistoria("Pequeña hortencia, mi vida corre con el agua de mi cuerpo, aquella agua que ha regado tus raices, \n y ha dejado que crezcas, hasta que pudieras florecer como el dia de hoy \n ");
            Thread.sleep(6000);
            this.contarHistoria("Lo se, todos los seres en este planeta tomamos la vida prestada \n Nos alimentamos de aquellos que estuvieron antes de nosotros, el agua que corre por mi cuerpo \n ha de llegar al mar, mucha de ella se perdera \n pero llegara a las nubes en el cielo para volver a caer sobre la tierra o el mar \n en un ciclo infinito\n");
            Thread.sleep(6000);
            this.contarHistoria("Es asi pequeña hortencia, todos en este planeta nos preguntamos porque los humanos se fueron \n al parecer no les gustaba el ciclo infinito de este planeta, ellos querian solo quitar y quitar pero no \n aceptaban las cosas que el planeta les daba a cambio, cuando \n mi cuerpo se ocngelo hace ya algun tiempo asi como muchas del agua \n no soportaron los cambios y las perdidas que ellos mismos provocaron y se marcharon\n");
            Thread.sleep(6000);
            this.contarHistoria("Ellos lanzaban muchas cosas a mi cuerpo, muchas de ellas no muy agradables \n pero los queria, mi agua tocaba sus cuerpos en la lluvia, recorria sus cuerpos, demostraban su tristeza \n atraves de mi, asi que llegue a amarlos, pero creo que ellos nunca me amaron, era seres extraños en realdiad \n no eran como tu, que al agradecer su vida estaban dispuestos a ser parte del ciclo regresando la energia que tomaron prestada\n");
            Thread.sleep(6000);
            this.contarHistoria("Pero ahora que ha regresado el ciclo armonioso, es verdad que los extraño, \n me pregunto si habrna logrado lo que buscaban, si algun dia regresan nosotros seguiremos aqui\n");
            Thread.sleep(6000);
            this.contarHistoria("Si, mientras seguimos dando vueltas en este ciclo, nos veremos siempre hermosa flor....\n");
            Thread.sleep(6000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    public String getNombre(){
        return nombre;
    }
    public void contarHistoria(String contar){
        System.out.println(this.getNombre()+": "+contar);
    }
}
