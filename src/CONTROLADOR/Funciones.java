/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import MODELO.persona;
import java.util.Scanner;

public class Funciones {

    public String menuPrincipal() {
        return "1- Registrar paciente\n2- Mostrar pacientes registrados\n3- Atender paciente\n4- eliminar paciente\n5- salir";
    }

    public String menuEstPaciente() {
        return "Ingrese el estado del paciente:\n1- Disponible\n2- Registrado\n3- Atendido";
    }

    public int validarEntrada(int min, int max, String mensaje) {

        boolean boleanito = false;
        int op = 0;
        do {
            try {
                System.out.println(mensaje);
                op = new Scanner(System.in).nextInt();
                while (op < min || op > max) {
                    System.out.println("Error, Opcion no valida");
                    op = new Scanner(System.in).nextInt();
                }
                boleanito = true;
            } catch (Exception e) {
                System.out.println("Error, Solo se adminten numeros");
            }
        } while (boleanito == false);
        return op;
    }

    public int validarEntradaEdad(int min, int max, String mensaje) {

        boolean boleanito = false;
        int op = 0;
        do {
            try {
                System.out.println(mensaje);
                op = new Scanner(System.in).nextInt();
                while (op < min || op > max) {
                    System.out.println("Error, rango de edad no permitido");
                    System.out.println("ingrese su edad");
                    op = new Scanner(System.in).nextInt();

                }
                boleanito = true;
            } catch (Exception e) {
                System.out.println("Error, Solo se adminten numeros");
            }
        } while (boleanito == false);
        return op;
    }

    public String llenarSalida(persona paciente) {
        String mensajito = paciente == null ? "" : paciente.mostrar_paciente() + "\n";
        return mensajito;

    }

    public void mostarTelefonos(String telefonos) {
        for (int i = 0; i < telefonos.split(",").length; i++) {
            System.out.println(telefonos.split(",")[i]);
        }

    }

    public void calcularcupo(persona p4) {
        if (p4 != null) {
            System.out.println("se ha llenado el numero de cupos de pacientes");
        }
    }

    public void pacientes_vacios(persona p1, persona p2, persona p3, persona p4) {
        if (p1 == null && p2 == null && p3 == null && p4 == null) {
            System.out.println("no hay pacientes");
        }
    }

    public persona crearPersona() {
        persona p = null;
        System.out.println("ingrese su nombre completo");
        String nombre_completo = new Scanner(System.in).nextLine();
        System.out.println("ingrese su numero de documeto");
        String numero_documento = new Scanner(System.in).nextLine();
        int edad = validarEntradaEdad(0, 150, "ingrese su edad");
        System.out.println("escriba su motivo de la consulta");
        String motivo_de_consulta = new Scanner(System.in).nextLine();
        System.out.println("ingrese sus telefonos separados por coma");
        String telefonos = new Scanner(System.in).nextLine();
        p = new persona(nombre_completo, numero_documento, edad, motivo_de_consulta, telefonos);
        return p;
    }

    public void atenderPersona(persona p1, persona p2, persona p3, persona p4) {
        try {

            System.out.println("********************");
            System.out.println("Escoja el paciente");
            if (p1.getEstado().equals("Registrado")) {
                System.out.println("1. " + p1.getNombre_completo());
            }
            if (p2.getEstado().equals("Registrado")) {
                System.out.println("2. " + p2.getNombre_completo());
            }
            if (p3.getEstado().equals("Registrado")) {
                System.out.println("3. " + p3.getNombre_completo());
            }
            if (p4.getEstado().equals("Registrado")) {
                System.out.println("4. " + p4.getNombre_completo());
            }

        } catch (Exception e) {
            
        }
        System.out.println("ingrese el numero del paciente a atender");
        int op2 = new Scanner(System.in).nextInt();
        switch (op2) {
        case 1:
            if (p1 != null) {
                p1.setEstado("Atendido");
                System.out.println("paciente atendido");
            } else {
                System.out.println("Ese paciente no existe");
            }
            break;

        case 2:
            if (p2 != null) {
                p2.setEstado("Atendido");
                System.out.println("paciente atendido");
            } else {
                System.out.println("Ese paciente no existe");
            }
            break;

        case 3:
            if (p3 != null) {
                p3.setEstado("Atendido");
                System.out.println("paciente atendido");
            } else {
                System.out.println("Ese paciente no existe");
            }
            break;

        case 4:
            if (p4 != null) {
                p4.setEstado("Atendido");
                System.out.println("paciente atendido");
            } else {
                System.out.println("Ese paciente no existe");
            }
            break;
    }
    }
    public void mostrarPersona(persona p1, persona p2, persona p3, persona p4) {
        System.out.println("Seleccione el paciente:");

        if (p1 != null) {
            System.out.println("1. " + p1.getNombre_completo());
        }
        if (p2 != null) {
            System.out.println("2. " + p2.getNombre_completo());
        }
        if (p3 != null) {
            System.out.println("3. " + p3.getNombre_completo());
        }
        if (p4 != null) {
            System.out.println("4. " + p4.getNombre_completo());
        }
    }
    
    public persona eliminarPersona(persona p) {
        System.out.println("paciente eliminado");
        return null;
    }
    public void eliminarPersona2(persona p1, persona p2, persona p3, persona p4){
     int op2 = validarEntrada(1, 4, "Seleccione paciente a eliminar");
                        switch (op2) {
                            case 1:
                                if (p1 != null) {
                                    p1 = eliminarPersona(p1);
                                } else {
                                    System.out.println("Ese paciente no existe");
                                }
                                break;

                            case 2:
                                if (p2 != null) {
                                    p2 = eliminarPersona(p2);
                                } else {
                                    System.out.println("Ese paciente no existe");
                                }
                                break;

                            case 3:
                                if (p3 != null) {
                                    p3 = eliminarPersona(p3);
                                } else {
                                    System.out.println("Ese paciente no existe");
                                }
                                break;

                            case 4:
                                if (p4 != null) {
                                    p4 = eliminarPersona(p4);
                                } else {
                                    System.out.println("Ese paciente no existe");
                                }
                                break;
                        }   
    }
}

