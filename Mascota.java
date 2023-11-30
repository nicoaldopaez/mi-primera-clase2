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
        kilos += nuevoPeso;
    }

    public void setEstado(){
        if(!dormido){
            dormido = true;
        }
        else{
            dormido = false; 
        }
    }

    public void imprimirEstado(){
        String estado = "";
        if(dormido != true){
            estado = "no";
        }
        else{
            estado = "si";
        }
        System.out.println("Nombre:"+" "+nombre+" | "+"Peso:"+" "+kilos+" | "+"Dormido:"+" "+estado);
    }

    public String getDetalles(){
        String estado = "";
        if(dormido != true){
            estado = "no";
        }
        else{
            estado = "si";
        }
        String detalles = "Nombre:" +nombre+" | "+"Peso:" +kilos+" | "+"Dormido:" +estado;
        
        return detalles;
    }





}