/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VISTA;

import CONTROLADOR.Funciones;
import MODELO.persona;
import java.util.Scanner;

public class menu {

    public static void main(String[] args) {
        int op = 0;
        persona p1 = null;
        persona p2 = null;
        persona p3 = null;
        persona p4 = null;
        Funciones f = new Funciones();
        do {
            op = f.validarEntrada(1, 5, f.menuPrincipal());
            switch (op) {
                case 1: {
                    if (p1 == null) {
                        p1 = f.crearPersona();
                    } else {
                        if (p2 == null) {
                            p2 = f.crearPersona();
                        } else {
                            if (p3 == null) {
                                p3 = f.crearPersona();
                            } else {
                                if (p4 == null) {
                                    p4 = f.crearPersona();

                                }
                            }
                        }
                    }
                }
                break;
                case 2: {
                    f.pacientes_vacios(p1, p2, p3, p4);
                    StringBuilder mensajito = new StringBuilder();
                    mensajito.append(f.llenarSalida(p1));
                    mensajito.append(f.llenarSalida(p2));
                    mensajito.append(f.llenarSalida(p3));
                    mensajito.append(f.llenarSalida(p4));
                    System.out.println(mensajito);
                }
                break;
                case 3: {
                    if (p1 == null && p2 == null && p3 == null && p4 == null) {
                        System.out.println("no hay pacientes");
                    } else {
                        f.atenderPersona(p1, p2, p3, p4);

                    }
                }
                break;
                case 4: {
                    if (p1 == null && p2 == null && p3 == null && p4 == null) {
                        System.out.println("no hay pacientes");
                    } else {
                        f.mostrarPersona(p1, p2, p3, p4);
                        f.eliminarPersona2(p1, p2, p3, p4);
                    }
                }
                break;

            }
        } while (op != 5);

    }
}
