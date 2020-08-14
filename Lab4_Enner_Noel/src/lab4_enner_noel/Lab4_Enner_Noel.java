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
import java.util.ArrayList;
import java.util.Scanner;

public class Lab4_Enner_Noel {

    /**
     * @param args the command line arguments
     */
    static char resp = 's';
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int edad, num_delitos;
        String nombre, genero, PaisResidencia, Encarcelado = "", DescFisica, NomVictima, fecha, pais;
        ArrayList Criminales = new ArrayList();
        ArrayList Agentes = new ArrayList();
        ArrayList Delitos = new ArrayList();
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
                            System.out.println("Ingrese el nombre del criminal: ");
                            nombre = sc.next();
                            System.out.println("Ingrese la edad: ");
                            edad = sc.nextInt();
                            System.out.println("Ingrese el genero: ");
                            genero = sc.next();
                            System.out.println("Ingrese el Pais de residencia del criminal: ");
                            PaisResidencia = sc.next();
                            System.out.println("¿ Esta Encarcelado ?");
                            System.out.println("1.Si: ");
                            System.out.println("2.No: ");
                            System.out.println("Ingrese una opcion: ");
                            int opcionEncarcelado = sc.nextInt();
                            switch (opcionEncarcelado) {
                                case 1:
                                    Encarcelado = "SI";
                                    break;
                                case 2:
                                    Encarcelado = "NO";
                                    break;
                                default:
                                    System.out.println("Numero ingresado no es valido!");
                            }
                            //fin menu encarcelado
                            System.out.println("Ingrese la descripcion fisica del criminal: ");
                            DescFisica = sc.next();
                            Criminales.add(new Criminales(nombre, edad, genero, PaisResidencia, Encarcelado, DescFisica));
                            System.out.println("Criminal creado con exito!!");
                            break;
                        case 2:
                            System.out.println(" Agentes Disponibles ");
                            System.out.println("1.Terrorista");
                            System.out.println("2.Asesino");
                            System.out.println("3.Secuestrador");
                            System.out.println("Ingrese una opcion: ");
                            int opcionAgentes = sc.nextInt();
                            switch (opcionAgentes) {
                                case 1:
                                    System.out.println("Ingrese el Pais a atacar: ");
                                    String PaisAtacar = sc.next();
                                    System.out.println("Ingrese la ciudad: ");
                                    String Ciudad = sc.next();
                                    System.out.println("Ingrese el metodo que usara el terrorista: ");
                                    String Metodo = sc.next();
                                    Agentes.add(new Terrorista(PaisAtacar, Ciudad, Metodo));
                                    System.out.println("Agente creado con exito!!");
                                    break;
                                case 2:
                                    System.out.println("Ingrese el nombre de la victima: ");
                                    NomVictima = sc.next();
                                    System.out.println("Ingrese el nombre de la arma: ");
                                    String Arma = sc.next();
                                    Agentes.add(new Asesino(NomVictima, Arma));
                                    System.out.println("Agente creado con exito!!");
                                    break;
                                case 3:
                                    System.out.println("Ingrese el nombre de la victima: ");
                                    NomVictima = sc.next();
                                    System.out.println("Ingrese la cantidad de dinero para el Rescate: ");
                                    double CantRescate = sc.nextDouble();
                                    Agentes.add(new Secuestrador(NomVictima, CantRescate));
                                    System.out.println("Agente creado con exito!!");
                                    break;
                                default:
                                    System.out.println("Numero ingresado no es valido!");
                            }
                            //FIN SUBMENU AGENTES
                            break;
                        case 3:
                            //Creado de delitos
                            System.out.println("1.Delito Menor: ");
                            System.out.println("2.Delito Grave: ");
                            System.out.println("Ingrese el tipo de delito: ");
                            int opcionDelito = sc.nextInt();
                            switch (opcionDelito) {
                                //DELITO MENOR
                                case 1:
                                    System.out.println("Ingrese la descripcion: ");
                                    String Descripcion = sc.next();
                                    System.out.println("Ingrese el nombre de la victima: ");
                                    nombre = sc.next();
                                    System.out.println("¿ Es Culpable ?");
                                    System.out.println("1.Si: ");
                                    System.out.println("2.No: ");
                                    System.out.println("Ingrese una opcion: ");
                                    int opcionCulpable = sc.nextInt();
                                    String Culpable = "";
                                    switch (opcionCulpable) {
                                        case 1:
                                            Culpable = "SI";
                                            break;
                                        case 2:
                                            Culpable = "NO";
                                            break;
                                        default:
                                            System.out.println("Numero ingresado no es valido!");
                                    }
                                    //fin menu CULPABLE

                                    System.out.println("***Sentencia****\n"
                                            + "1 - Años\n"
                                            + "2 - Pena de muerte\n"
                                            + "Ingrese su opción: ");
                                    int opcionSentencia = sc.nextInt();
                                    String sentencia = "";
                                    switch (opcionSentencia) {
                                        case 1:
                                            System.out.println("Ingrese los años: ");
                                            sentencia = sc.next();
                                            break;
                                        case 2:
                                            sentencia = "Pena de muerte";
                                            break;
                                        default:
                                            System.out.println("Opcion no valida");
                                    }
                                    //fin submenu Sentencia!!!!
                                    System.out.println("Ingrese la fecha del delito: ");
                                    fecha = sc.next();
                                    System.out.println("Ingrese el Pais: ");
                                    pais = sc.next();
                                    System.out.println("Ingrese el Numero de delito: ");
                                    num_delitos = sc.nextInt();
                                    System.out.println("Ingrese el nombre del policia que lo detuvo: ");
                                    String name_oficial = sc.next();
                                    System.out.println("Ingrese el ID del oficial: ");
                                    String ID = sc.next();
                                    System.out.println("Ingrese el numero de celda donde se encuentra el criminal: ");
                                    int num_celda = sc.nextInt();
                                    System.out.println("Tipo de delito Menor: ");
                                    System.out.println("1.Vandalismo: ");
                                    System.out.println("2.Hurto: ");
                                    System.out.println("3.Prostitucion: ");
                                    System.out.println("Ingrese un tipo: ");
                                    int opciontipoDelito = sc.nextInt();
                                    switch (opciontipoDelito) {
                                        case 1:
                                            System.out.println("Ingrese la edificacion: ");
                                            String edificacion = sc.next();
                                            System.out.println("Ingrese la cantidad de pisos: ");
                                            String pisos = sc.next();
                                            System.out.println("Ingrese el nombre del dueño del edificio: ");
                                            String nombre_dueño = sc.next();
                                            Delitos.add(new Vandalismo(edificacion, pisos, nombre_dueño, name_oficial, ID, num_celda, Descripcion, nombre, Culpable, sentencia, fecha, pais, num_delitos));
                                            System.out.println("Delito creado con exito!!");
                                            break;
                                        case 2:
                                            System.out.println("Ingrese el objeto robado: ");
                                            String objeto = sc.next();
                                            System.out.println("Ingrese el valor del objeto: ");
                                            double valor = sc.nextDouble();
                                            Delitos.add(new Hurto(objeto, valor, name_oficial, ID, num_celda, Descripcion, nombre, Culpable, sentencia, fecha, pais, num_delitos));
                                            System.out.println("Delito creado con exito!!");
                                            break;
                                        case 3:
                                            System.out.println("Ingrese el nombre del solicitante: ");
                                            String nombre_solicitante = sc.next();
                                            Delitos.add(new Prostitución(nombre_solicitante, name_oficial, ID, num_celda, Descripcion, nombre, Culpable, sentencia, fecha, pais, num_delitos));
                                            System.out.println("Delito creado con exito!!");
                                            break;
                                        default:
                                            System.out.println("Numero introducido no es valido!");
                                    }
                                    //fin submenu tipos delitos

                                    break;
                                case 2:
                                    //DELITO MAYOR
                                    System.out.println("Ingrese la descripcion: ");
                                    Descripcion = sc.next();
                                    System.out.println("Ingrese el nombre de la victima: ");
                                    nombre = sc.next();
                                    System.out.println("¿ Es Culpable ?");
                                    System.out.println("1.Si: ");
                                    System.out.println("2.No: ");
                                    System.out.println("Ingrese una opcion: ");
                                    opcionCulpable = sc.nextInt();
                                    Culpable = "";
                                    switch (opcionCulpable) {
                                        case 1:
                                            Culpable = "SI";
                                            break;
                                        case 2:
                                            Culpable = "NO";
                                            break;
                                        default:
                                            System.out.println("Numero ingresado no es valido!");
                                    }
                                    //fin menu CULPABLE

                                    System.out.println("***Sentencia****\n"
                                            + "1 - Años\n"
                                            + "2 - Pena de muerte\n"
                                            + "Ingrese su opción: ");
                                    opcionSentencia = sc.nextInt();
                                    sentencia = "";
                                    switch (opcionSentencia) {
                                        case 1:
                                            System.out.println("Ingrese los años: ");
                                            sentencia = sc.next();
                                            break;
                                        case 2:
                                            sentencia = "Pena de muerte";
                                            break;
                                        default:
                                            System.out.println("Opcion no valida");
                                    }
                                    //fin submenu Sentencia!!!!
                                    System.out.println("Ingrese la fecha del delito: ");
                                    fecha = sc.next();
                                    System.out.println("Ingrese el Pais: ");
                                    pais = sc.next();
                                    System.out.println("Ingrese el Numero de delito: ");
                                    num_delitos = sc.nextInt();
                                    System.out.println("Ingrese la gravedad del delito(1-5): ");
                                    int Grave = sc.nextInt();
                                    while (Grave > 5 || Grave < 1) {
                                        System.out.println("Numero Ingresado no es valido! ");
                                        System.out.println("Ingrese la gravedad del delito(1-5): ");
                                        Grave = sc.nextInt();
                                    }
                                    System.out.println("Tipo de delito Mayor: ");
                                    System.out.println("1.Terrorismo: ");
                                    System.out.println("2.Asesino: ");
                                    System.out.println("3.Violacion: ");
                                    System.out.println("4.Secuestro: ");
                                    System.out.println("5.Trafico de drogas: ");
                                    System.out.println("Ingrese un tipo: ");
                                    int opciontipoDelitoMayor = sc.nextInt();
                                    switch (opciontipoDelitoMayor) {
                                        case 1:
                                            System.out.println("Ingrese el nombre del artefacto: ");
                                            String NomArtefacto = sc.next();
                                            System.out.println("Ingrese el numero de victimas: ");
                                            int NumVictimas = sc.nextInt();
                                            Delitos.add(new Terrorismo(NomArtefacto, NumVictimas, Grave, Descripcion, nombre, Culpable, sentencia, fecha, pais, num_delitos));
                                            System.out.println("Delito creado con exito!!");
                                            break;
                                        case 2:
                                            System.out.println("Ingrese el nombre de la arma: ");
                                            String NomArma = sc.next();
                                            System.out.println("Ingrese el numero de cuerpos: ");
                                            int NumCuerpos = sc.nextInt();
                                            Delitos.add(new Asesinato(NomArma, NumCuerpos, Grave, Descripcion, nombre, Culpable, sentencia, fecha, pais, num_delitos));
                                            System.out.println("Delito creado con exito!!");
                                            break;
                                        case 3:
                                            System.out.println("Ingrese la edad de la victima: ");
                                            int EdadVictima = sc.nextInt();
                                            Delitos.add(new Violación(EdadVictima, Grave, Descripcion, nombre, Culpable, sentencia, fecha, pais, num_delitos));
                                            System.out.println("Delito creado con exito!!");
                                            break;
                                        case 4:
                                            System.out.println("Ingrese el tiempo retenido: ");
                                            String TiempoRetenido = sc.next();
                                            System.out.println(" ¿Fue devuelto vivo o muerto ? ");
                                            System.out.println("1.Vivo");
                                            System.out.println("2.Muerto");
                                            System.out.println("Ingrese una opcion: ");
                                            int opcionestadopersona = sc.nextInt();
                                            String EstadoPersona = "";
                                            switch (opcionestadopersona) {
                                                case 1:
                                                    EstadoPersona = "Vivo";
                                                    break;
                                                case 2:
                                                    EstadoPersona = "Muerto";
                                                    break;
                                                default:
                                                    System.out.println("Opcion no valida!!");
                                            }
                                            Delitos.add(new Secuestro(TiempoRetenido, EstadoPersona, Grave, Descripcion, nombre, Culpable, sentencia, fecha, pais, num_delitos));
                                            System.out.println("Delito creado con exito!!");
                                            break;
                                        case 5:
                                            System.out.println("Ingrese el nombre de la droga: ");
                                            String NomDroga = sc.next();
                                            System.out.println("Ingresa la cantidad de droga: ");
                                            int CantDroga = sc.nextInt();
                                            Delitos.add(new TraficoDeDrogas(NomDroga, CantDroga, Grave, Descripcion, nombre, Culpable, sentencia, fecha, pais, num_delitos));
                                            System.out.println("Delito creado con exito!!");
                                            break;
                                        default:
                                            System.out.println("Numero ingresado no es valido!");
                                    }
                                    break;
                                default:
                                    System.out.println("Numero ingresado no es valido!");
                            }
                        //fin submenu DELITOS

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
                            for (Object o : Criminales) {
                                System.out.println(Criminales.indexOf(o)+"-"+o);
                            }
                            System.out.println("Ingrese la posición a eliminar: ");
                            int pos = sc.nextInt();
                            while (pos < 0 || pos > Criminales.size()) {
                                System.out.println("Valor introducido no es valido!");
                            }
                            Criminales.remove(pos);
                            break;
                        case 2:
                            for (Object o : Agentes) {
                                System.out.println(Agentes.indexOf(o)+"-"+o);
                            }
                            System.out.println("Ingrese la posición a eliminar: ");
                            pos = sc.nextInt();
                            while (pos < 0 || pos > Agentes.size()) {
                                System.out.println("Valor introducido no es valido!");
                            }
                            Agentes.remove(pos);
                            break;
                        case 3:
                            for (Object o : Delitos) {
                                System.out.println(Delitos.indexOf(o)+"-"+o);
                            }
                            System.out.println("Ingrese la posición a eliminar: ");
                            pos = sc.nextInt();
                            while (pos < 0 || pos > Delitos.size()) {
                                System.out.println("Valor introducido no es valido!");
                            }
                            Delitos.remove(pos);
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
                            for (Object o : Criminales) {
                                System.out.println(Criminales.indexOf(o)+"-"+o);
                            }
                            break;
                        case 2:
                            for (Object o : Agentes) {
                                System.out.println(Agentes.indexOf(o)+"-"+o);
                            }
                            break;
                        case 3:
                            for (Object o : Delitos) {
                                System.out.println(Delitos.indexOf(o)+"-"+o);
                            }
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
