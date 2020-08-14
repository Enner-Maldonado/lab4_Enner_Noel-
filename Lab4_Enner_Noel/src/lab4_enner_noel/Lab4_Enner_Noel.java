/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_enner_noel;

/**
 *
 * @author ENNER
 */
import java.util.Scanner;

public class Lab4_Enner_Noel {

    /**
     * @param args the command line arguments
     */
    static char resp = 's';
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (resp == 's' || resp == 'S') {
            System.out.println("1. Menu Crear");
            System.out.println("2. Menu Modificar");
            System.out.println("3. Menu Eliminar");
            System.out.println("4. Menu Listar");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opcion: ");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("1.Crear Criminal: ");
                    System.out.println("2.Crear Agente: ");
                    System.out.println("3.Crear Delito: ");
                    System.out.println("Ingrese una opcion: ");
                    int opcionC = sc.nextInt();
                    switch (opcionC) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Numero ingresado no es valido!");
                    }
                    //AQUI TERMINA EL MEMU DE CREAR!!!!!!
                    break;
                case 2:
                    System.out.println("1.Modificar Criminal: ");
                    System.out.println("2.Modificar Agente: ");
                    System.out.println("3.Modificar Delito: ");
                    System.out.println("Ingrese una opcion: ");
                    int opcionM = sc.nextInt();
                    switch (opcionM) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Numero ingresado no es valido!");
                    }
                    //AQUI TERMINA EL MENU DE MODIFICAR!!!!!
                    break;
                case 3:
                    System.out.println("1.Eliminar Criminal: ");
                    System.out.println("2.Eliminar Agente: ");
                    System.out.println("3.Eliminar Delito: ");
                    System.out.println("Ingrese una opcion: ");
                    int opcionE = sc.nextInt();
                    switch (opcionE) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Numero ingresado no es valido!");
                    }
                    //AQUI TERMINA EL MENU DE ELIMINAR !!!!!!!
                    break;
                case 4:
                    System.out.println("1.Listar Criminales: ");
                    System.out.println("2.Listar Agentes: ");
                    System.out.println("3.Listar Delitos: ");
                    System.out.println("Ingrese una opcion: ");
                    int opcionL = sc.nextInt();
                    switch (opcionL) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Numero ingresado no es valido!");
                    }
                    //AQUI TERMINA EL MENU DE LISTAR !!!!!!
                    break;
                case 5:
                    resp = 'n';
                    break;
                default:
                    System.out.println("Numero ingresado no es valido!");
            }
        }
    }

}
