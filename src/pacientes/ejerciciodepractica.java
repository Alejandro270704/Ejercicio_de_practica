/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pacientes;

import java.util.Scanner;

public class Pacientes {

    static String menuPrincipal() {
        return "1- Registrar paciente\n2- Mostrar pacientes registrados\n3- Atender paciente\n4- Salir";
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

    static void mostarTelefonos(String telefonos) {
        for (int i = 0; i < telefonos.split(",").length; i++) {
            System.out.println(telefonos.split(",")[i]);
        }

    }

    public static void main(String[] args) {
        int op = 0;
        persona p1 = null;
        persona p2 = null;
        persona p3 = null;
        persona p4 = null;
        do {
            op = validarEntrada(1, 4, menuPrincipal());
            switch (op) {
                case 1:
                    if (p4 !=null){
                                    System.out.println("se ha llenado el numero de cupos de pacientes");
                                    break;
                                }
                    int personatotal = 4;
                    System.out.println("ingrese su nombre completo");
                    String nombre_completo = new Scanner(System.in).nextLine();
                    System.out.println("ingrese su numero de documeto");
                    String numero_documento = new Scanner(System.in).nextLine();
                    int edad = validarEntrada(0, 150,"ingrese su edad");
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
                    
                    break;
                case 3:
                    String mensaje="";
                    if(p1.estado != null && p2.estado!= null && p3.estado!= null && p4.estado!= null){
                        
                    }else{
                    if(p1.estado.equals("Registrado")){
                        mensaje+=p1.nombre_completo + "\n";
                    }else{
                        if(p2.estado.equals("Registrado")){
                            mensaje+=p2.nombre_completo + "\n";
                        }
                        else{
                        if(p3.estado.equals("Registrado")){
                            mensaje+=p2.nombre_completo + "\n";
                        }
                        else{
                        if(p4.estado.equals("Registrado")){
                            mensaje+=p2.nombre_completo + "\n";

                        }
                        else{
                        System.out.println("no hay pacientes");
                    }
                        }
                        
                        }
                    }
                    
                    
                    }
                    
                    System.out.println("pacientes disponibles "+ "\n"+ mensaje);
                    break;
            }
        } while (op != 4);

    }
}
