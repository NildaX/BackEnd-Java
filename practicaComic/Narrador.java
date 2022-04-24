public class Narrador extends Thread{
    public void run(){
        try {
            long inicio = System.currentTimeMillis();
            System.out.println("Esta historia empieza en lo alto de una montaña, \n ha llovido recientemente, el rio corre, la brisa y el polen estan en el ambiente, \n curiosamente una hortencia florece al lado de un río, y comienzan un dialogo...\n");
            Thread.sleep(120000);
            System.out.println("Y asi la historia ha terminado...");
            long fin = System.currentTimeMillis();
            double tiempo = (double) ((fin - inicio)/1000);
            System.out.println(tiempo +"s segundos");
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

    }
}
