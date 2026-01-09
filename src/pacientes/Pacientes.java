/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pacientes;

import java.util.Scanner;

public class Pacientes {

    static String menuPrincipal() {
        return "1- Registrar paciente\n2- Mostrar pacientes registrados\n3- Atender paciente\n4- eliminar paciente\n5- salir";
    }

    static String menuEstPaciente() {
        return "Ingrese el estado del paciente:\n1- Disponible\n2- Registrado\n3- Atendido";
    }

    static public int validarEntrada(int min, int max, String mensaje) {

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

    static public int validarEntradaEdad(int min, int max, String mensaje) {

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
    static public String llenarSalida(persona paciente){
      String mensajito= paciente== null? "":paciente.mostrar_paciente()+"\n";
      return mensajito;
    
    }

    static void mostarTelefonos(String telefonos) {
        for (int i = 0; i < telefonos.split(",").length; i++) {
            System.out.println(telefonos.split(",")[i]);
        }

    }

    public static void main(String[] args) {
        int op = 0;
        int op2 = 0;
        persona p1 = null;
        persona p2 = null;
        persona p3 = null;
        persona p4 = null;
        do {
            op = validarEntrada(1, 5, menuPrincipal());
            switch (op) {
                case 1:
                    if (p4 != null) {
                        System.out.println("se ha llenado el numero de cupos de pacientes");
                        break;
                    }
                    int personatotal = 4;
                    System.out.println("ingrese su nombre completo");
                    String nombre_completo = new Scanner(System.in).nextLine();
                    System.out.println("ingrese su numero de documeto");
                    String numero_documento = new Scanner(System.in).nextLine();
                    int edad = validarEntradaEdad(0, 150, "ingrese su edad");
                    System.out.println("escriba su motivo de la consulta");
                    String motivo_de_consulta = new Scanner(System.in).nextLine();
                    System.out.println("ingrese sus telefonos separados por coma");
                    String telefonos = new Scanner(System.in).nextLine();
                    if (p1 == null) {
                        p1 = new persona(nombre_completo, numero_documento, edad, motivo_de_consulta, telefonos);

                    } else {
                        if (p2 == null) {
                            p2 = new persona(nombre_completo, numero_documento, edad, motivo_de_consulta, telefonos);
                        } else {
                            if (p3 == null) {
                                p3 = new persona(nombre_completo, numero_documento, edad, motivo_de_consulta, telefonos);
                            } else {
                                if (p4 == null) {
                                    p4 = new persona(nombre_completo, numero_documento, edad, motivo_de_consulta, telefonos);

                                }
                            }
                        }
                    }
                    break;
                case 2:
                    if (p1 == null && p2 == null && p3 == null && p4 == null) {
                        System.out.println("no hay pacientes");
                    }
                    StringBuilder mensajito =new StringBuilder();
                   mensajito.append(llenarSalida(p1));
                   mensajito.append(llenarSalida(p2));
                   mensajito.append(llenarSalida(p3));
                   mensajito.append(llenarSalida(p4));
                    System.out.println(mensajito);
                    break;
                case 3:

                    if (p1 == null && p2 == null && p3 == null && p4 == null) {
                        System.out.println("no hay pacientes");
                    } else {
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
                        op2 = new Scanner(System.in).nextInt();
                        if (op2 == 1) {
                            p1.setEstado("Atendido");
                            System.out.println("paciente atendido");
                        }
                        if (op2 == 2) {
                            p2.setEstado("Atendido");
                            System.out.println("paciente atendido");

                        }
                        if (op2 == 3) {
                            p3.setEstado("Atendido");
                            System.out.println("paciente atendido");

                        }
                        if (op2 == 4) {
                            p4.setEstado("Atendido");
                            System.out.println("paciente atendido");

                        }
                    }

                    break;
                case 4: 
                    if (p1 == null && p2 == null && p3 == null && p4 == null) {
                        System.out.println("no hay pacientes");
                    } else {
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
                        op2 = new Scanner(System.in).nextInt();
                        if (op2 == 1) {
                            p1=null;
                            System.out.println("paciente eliminado");
                        }
                        if (op2 == 2) {
                            p2=null;
                            System.out.println("paciente eliminado");

                        }
                        if (op2 == 3) {
                            p3=null;
                            System.out.println("paciente eliminado");

                        }
                        if (op2 == 4) {
                            p4=null;
                            System.out.println("paciente eliminado");

                        }
                    }
                    
            }
        } while (op != 5);

    }
}
