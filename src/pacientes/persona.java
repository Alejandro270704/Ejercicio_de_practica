/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacientes;

public class persona {

    String nombre_completo;
    String numero_documento;
    int edad;
    String motivo_de_consulta;
    String telefonos;
    String tipo_paciente;
    String estado = "Registrado";

    public persona(String nombre_completo, String numero_documento, int edad, String motivo_de_consulta, String telefonos) {
        this.nombre_completo = nombre_completo;
        this.numero_documento = numero_documento;
        this.edad = edad;
        this.motivo_de_consulta = motivo_de_consulta;
        this.telefonos = telefonos;
        this.tipo_paciente = calcular_paciente();
        this.estado = estado;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMotivo_de_consulta() {
        return motivo_de_consulta;
    }

    public void setMotivo_de_consulta(String motivo_de_consulta) {
        this.motivo_de_consulta = motivo_de_consulta;
    }

    public String getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }

    public String getTipo_paciente() {
        return tipo_paciente;
    }

    public void setTipo_paciente(String tipo_paciente) {
        this.tipo_paciente = tipo_paciente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String calcular_paciente() {
        String vtipo_paciente = edad >= 18 ? "Mayor de edad" : "Menor de edad";
        return vtipo_paciente;
    }

    public String mostrarTelefono() {
        String tel = ".";
        if (telefonos.split(",").length == 1) {
            tel += telefonos;
        } else {
            for (int i = 0; i < telefonos.split(",").length; i++) {
                tel+=telefonos.split(",").length +"\n";
            }
        }
        return tel.substring(1);
    }

    public String mostrar_paciente() {
        return"nombre completo:" + nombre_completo + "\n numero documento:" + numero_documento + "\n edad:" + edad + "\n motivo de consulta:" + motivo_de_consulta + "\n telefonos:" + mostrarTelefono() + "\n tipo paciente:" + tipo_paciente + "\n estado:" + estado + "\n";
    }

}