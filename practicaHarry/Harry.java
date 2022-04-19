public class Harry {
    private String casaHogwarts;
    private String genero;
    private String nombre;
    private String patronus;
    private String boggart;
    private String mejorAtributo;
    public Harry(String nombre, String casaHogwarts, String genero, String patronus, String boggart, String mejorAtributo){
        this.nombre=nombre;
        this.casaHogwarts=casaHogwarts;
        this.genero=genero;
        this.patronus=patronus;
        this.boggart=boggart;
        this.mejorAtributo=mejorAtributo;
    }
    public void setCasaHogwarts(String c){
        this.casaHogwarts=c;
    }
    public void setGenero(String c){
        this.genero=c;
    }
    public void setNombre(String c){
        this.nombre=c;
    }
    public void setPatronus(String c){
        this.patronus=c;
    }
    public void setBoggart(String c){
        this.boggart=c;
    }
    public void setMejorAtributo(String c){
        this.mejorAtributo=c;
    }
    public String getCasaHogwarts(){
        return casaHogwarts;
    }
    public String getGenero(){
        return genero;
    }
    public String getNombre(){
        return nombre;
    }
    public String getPatronus(){
        return patronus;
    }
    public String getBoggart(){
        return boggart;
    }
    public String getMejorAtributo(){
        return mejorAtributo;
    }
}

