public class Mascota{
    private String nombre;
    private int kilos;
    private boolean dormido;
    
    public Mascota(String nomMascota, int kgs){
        nombre = nomMascota;
        kilos = kgs;
        dormido = false;
    }
    public String getNombre(){
        return nombre;
    }
    public int getKilos(){
        return kilos;
    }
    public boolean getEstado(){
        return dormido;
    }
    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }
    public void setKilos(int nuevoPeso){
        kilos = nuevoPeso;
    }
    public void setEstado(){
        dormido = true;
    }

    





}