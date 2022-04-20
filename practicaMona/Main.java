public class Main {
    public static void main(String[] args) {
        MonaOriginal mona1= new MonaOriginal("Octodex","Original","Ninguno",1);
        System.out.println(mona1.getNombre());
        mona1.realizarActividad();
        monaPythocat mona2= new monaPythocat("Pythocat","Python","Serpientes",12);
        System.out.println(mona2.getNombre());
        mona2.realizarActividad();
        monaOctonaut mona3= new monaOctonaut("Octonaut","Astronauta","Traje espacial",15);
        System.out.println(mona3.getNombre());
        mona3.realizarActividad();
        monaSpectrocat mona4= new monaSpectrocat("Spectrocat","Fantasma","Traje de fantasma",44);
        System.out.println(mona4.getNombre());
        mona4.realizarActividad();
        monaNyantocat mona5= new monaNyantocat("Nyantocat","Gato","Arcoiris",46);
        System.out.println(mona5.getNombre());
        mona5.realizarActividad();
        monaCodercat mona6= new monaCodercat("Codercat","Programador","Computadora y café",70);
        System.out.println(mona6.getNombre());
        mona6.realizarActividad();
    }
}
