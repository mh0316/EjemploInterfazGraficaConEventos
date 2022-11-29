package modelo;

public class Jugador extends Persona {
    private String equipo;
    private String posicion;

    public Jugador () {
        super("Gary", "Medel", "123456789");
        equipo = "Selección Chilena";
        posicion = "Defensa";
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getPosicion() {
        return this.posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String toString() {
        return ("Nombre: " + super.nombre + " " + super.apellido + "\nRut: " + super.rut + "\nAFP: " + this.equipo + "\nIsapre: " + this.posicion);
    }
}