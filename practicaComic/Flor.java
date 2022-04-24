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
    public void setEstado(String estado){
        this.estado=estado;
    }
    public void run(){
        try {
            Thread.sleep(6000);
            this.contarHistoria("Este día ha empezado maravillosamente, he pasado de ser un "+this.getEstado());
            this.setEstado("Flor");
            this.contarHistoria("a ser una "+this.getEstado()+" , mi vida ha empezado viendo hacia el sol \n y al lado de este rio, ¿Pequeño rio, como esta tu vida?");
            Thread.sleep(6000);
            this.contarHistoria("Se que he crecido gracias a tus cuidados, tu agua me alimenta, pero tambien lo hace \n la luz del sol y los nutrientes de la tierra, ¿Sabes, debajo de mi hay incontables \n cuerpos sin almas, que estan regresando la vida que tomaron prestada de este mundo \n esa energia, es ahora tambien parte de mi \n");
            Thread.sleep(6000);
            this.contarHistoria("Pareciera que de verdad es infinito, algo que he aprendido de mis raices, \n es que hace mucho tiempo aqui habia algo que se hacian llamar seres humanos \n que se cansaron de esta tierra sucia y volaron hacia lo que parece el infinito \n para no regresar, se llevaron muchas cosas de este mundo tantas cosas como las que se llevaron \n ");
            Thread.sleep(6000);
            this.contarHistoria("Es así, hermoso rio, no pudieron ver más alla de la situacion armoniosa que les dio el mundo, \n y cuando regreso lo que ellos mismo habian provocado, decidieron irse, sin saber que este ciclo solo vuelve a empezar, dime hermoso rio, ¿Tu los extrañas? \n");
            Thread.sleep(6000);
            this.contarHistoria("Es lo que oí, se negaban a volver a la tierra, construian edificaciones a traves de su cuerpo, creyendo que este se mantendira intacto, \n rechazaban el ciclo natural de la vida por eso arrebataban vidas y recursos de este planeta creyendo que eran sus dueños \n");
            Thread.sleep(6000);
            this.contarHistoria("Es verdad, ya no seremos los mismos, tal vez ahora por fin pueda ser un animal, pero \n los esperare, como todos en este planeta");
            Thread.sleep(6000);
            this.contarHistoria("Claro que si hermoso rio, mientras tanto podemos seguir observando las maravillas de este munco,\n que son suficientes para nosotros y para todos aqui, nos veremos de nuevo Rio...\n");
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
