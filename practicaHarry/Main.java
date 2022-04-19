public class Main {
    public static void main(String[] args) {
        System.out.println("Mis personajes favoritos de la Saga de Harry Potter son:");
        Neville myNeville= new Neville("Neville Longbottom","Gryffindor","Hombre","No corpóreo","El profesor Severus","Es muy amable y ayuda a los demás");
        System.out.println("1.-"+myNeville.getNombre()+" ,"+
                "es "+ myNeville.getGenero()+", "+
                " es de la casa de Hogwarts: "+ myNeville.getCasaHogwarts()+" ,"+
                "su patronus es: "+myNeville.getPatronus()+" ,"+
                "\n su boggart es: "+myNeville.getBoggart()+" ,"+
                " y su mayor atributo es: "+myNeville.getMejorAtributo());
        Severus mySeverus= new Severus("Severus Snape","Slytherin","Hombre","Cierva","Lord Voldemort","Leal y con un corazón amable");
        System.out.println("2.-"+mySeverus.getNombre()+" ,"+
                "es "+ mySeverus.getGenero()+", "+
                " es de la casa de Hogwarts: "+ mySeverus.getCasaHogwarts()+" ,"+
                "su patronus es: "+mySeverus.getPatronus()+" ,"+
                "\n su boggart es: "+mySeverus.getBoggart()+" ,"+
                " y su mayor atributo es: "+mySeverus.getMejorAtributo());
        Luna myLuna= new Luna("Luna Lovegood","Gryffindor","Mujer","Liebre","El aburrimiento","Es divertida");
        System.out.println("3.-"+myLuna.getNombre()+" ,"+
                "es "+ myLuna.getGenero()+", "+
                " es de la casa de Hogwarts: "+ myLuna.getCasaHogwarts()+" ,"+
                "su patronus es: "+myLuna.getPatronus()+" ,"+
                "\n su boggart es: "+myLuna.getBoggart()+" ,"+
                " y su mayor atributo es: "+myLuna.getMejorAtributo());
        Ron myRon= new Ron("Ronald Weasley","Gryffindor","Hombre","Jack Russell Terrier","Acromántula","Es muy amable y ayuda a los demás");
        System.out.println("4.-"+myRon.getNombre()+" ,"+
                "es "+ myRon.getGenero()+", "+
                " es de la casa de Hogwarts: "+ myRon.getCasaHogwarts()+" ,"+
                "su patronus es: "+myRon.getPatronus()+" ,"+
                "\n su boggart es: "+myRon.getBoggart()+" ,"+
                " y su mayor atributo es: "+myRon.getMejorAtributo());
        Harry myHarry= new Harry("Harry Potter","Gryffindor","Hombre","Ciervo","Dementor","Es muy amable y ayuda a los demás");
        System.out.println("5.-"+myHarry.getNombre()+" ,"+
                "es "+ myHarry.getGenero()+", "+
                "es de la casa de Hogwarts: "+ myHarry.getCasaHogwarts()+" ,"+
                "su patronus es: "+myHarry.getPatronus()+" ,"+
                "\n su boggart es: "+myHarry.getBoggart()+" ,"+
                " y su mayor atributo es: "+myHarry.getMejorAtributo());
    }
}
