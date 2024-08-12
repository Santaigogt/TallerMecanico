

package TallerMecanico.Mecanicos;

/**
 * ID, nombre, especialidad
 *
 * @author bizco
 */
public class mecanico {

    private String Id;
    private String nombre;
    private String especialidad;

    public String getId() {
        return Id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public mecanico(String Id, String nombre, String especialidad) {
        this.Id = Id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public mecanico() {
        this.Id = "";
        this.nombre = "";
        this.especialidad = "";
    }

    @Override
    public String toString() {
        return "mecanico{" + "Id=" + Id + ", nombre=" + nombre + ", especialidad=" + especialidad + '}';
    }

}
