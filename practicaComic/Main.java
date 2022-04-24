public class Main {
    public static void main(String[] args) {
        Narrador n=new Narrador();
        n.start();
        Flor f=new Flor("Hortencia");
        f.start();
        Agua a=new Agua("Agua");
        a.start();

    }
}
