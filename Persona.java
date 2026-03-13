import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String sexo;
    private LocalDate fechaDeNacimiento;
    private String numeroTelefonico;

    public Persona(String nombre, String sexo, LocalDate fechaDeNacimiento, String numeroTelefonico) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.numeroTelefonico = numeroTelefonico;
    }

    public Persona() {
        this.nombre = "Sin nombre";
        this.sexo = "Masculino";
        this.fechaDeNacimiento = LocalDate.of(1990, 5, 16);;
        this.numeroTelefonico = "5555555555";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNumeroTelefono() {
        return numeroTelefonico;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefonico = numeroTelefono;
    }
}