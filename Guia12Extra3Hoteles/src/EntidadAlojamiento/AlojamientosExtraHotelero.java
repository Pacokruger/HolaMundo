/*
En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa.
 */
package EntidadAlojamiento;

import EntidadPadre.Alojamiento;

/**
 *
 * @author Paola
 */
public class AlojamientosExtraHotelero extends Alojamiento {
    
    protected boolean privado;
    protected int metrosCuadrados;

    public AlojamientosExtraHotelero() {
    }

    public AlojamientosExtraHotelero(boolean privado, int metrosCuadrados, String nombre, String direccion, String localidad, String encargado) {
        super(nombre, direccion, localidad, encargado);
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
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

    @Override
    public String toString() {
        return "AlojamientosExtraHotelero{" + "privado=" + privado + ", metrosCuadrados=" + metrosCuadrados + '}'+super.toString();
    }
    
    
    
}
