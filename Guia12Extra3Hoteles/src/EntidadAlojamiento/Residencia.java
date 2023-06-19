/*
Para las residencias se indica la cantidad de habitaciones, si se hacen o no 
descuentos a los gremios y si posee o no campo deportivo.
 */
package EntidadAlojamiento;

/**
 *
 * @author Paola
 */
public class Residencia extends AlojamientosExtraHotelero {
    
    protected int cantHab;
    protected boolean descGremio;
    protected boolean campoDeportivo;

    public Residencia() {
    }

    public Residencia(int cantHab, boolean descGremio, boolean campoDeportivo, boolean privado, int metrosCuadrados, String nombre, String direccion, String localidad, String encargado) {
        super(privado, metrosCuadrados, nombre, direccion, localidad, encargado);
        this.cantHab = cantHab;
        this.descGremio = descGremio;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantHab() {
        return cantHab;
    }

    public void setCantHab(int cantHab) {
        this.cantHab = cantHab;
    }

    public boolean isDescGremio() {
        return descGremio;
    }

    public void setDescGremio(boolean descGremio) {
        this.descGremio = descGremio;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    @Override
    public String toString() {
        return "Residencia{" + "cantHab=" + cantHab + ", descGremio=" + descGremio + ", campoDeportivo=" + campoDeportivo + '}'+super.toString();
    }

    public double precioHabitacion(){
        int valorHab=50+cantHab;
        if (privado==true) {
            valorHab+=20;
        }
        if (descGremio==true) {
            valorHab-=10;
        }
        if (campoDeportivo==true) {
            valorHab+=30;
        }
        return valorHab;
    }
}
