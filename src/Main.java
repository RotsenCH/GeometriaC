import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static DecimalFormat dc = new DecimalFormat("##.00");//Redondeo a los numeros de resultado por 2 decimales
    static final String RESET = "\u001B[0m";//Elimina el color anterior
    static final String AZUL = "\u001B[34m";//Color azul a las letras
    static final String ROJO = "\u001B[31m";//Color rojo a las letras
    static final String VERDE = "\u001B[32m";//Color verde a las letras
    public static void main(String[] args) {



        boolean pausa = false; //Variable para para la repeticion del ciclo while

        try{
            while (!pausa){
                int opcion = menuPrincipal();
                switch(opcion){
                    case 1:{
                        boolean pausaA = false;//Variable de finalizacion del ciclo while
                        System.out.println("\n\n\t\t1. Calculo de areas de figuras geometricas");
                        while(!pausaA){
                            int opA = menuFiguras();//Ingreso de la opcion del menu figuras Areas

                            switch (opA) {
                                case 1: {
                                    double ladoC = 0;
                                    //Solicitud de datos
                                    System.out.println("\t1. Cuadrado");
                                    System.out.print("Ingrese el valor del lado del cuadrado: ");
                                    double ladoACuadrado = sc.nextDouble();
                                    geom Migeom = new geom(ladoACuadrado);
                                    System.out.println("El area del cuadrado es: " + dc.format(Migeom.areaCuadrado(Migeom)));
                                }
                                break;
                                case 2: {
                                    System.out.println("\t2. Rectangulo");
                                    double baseR, alturaR;
                                    //Solicitud de datos
                                    System.out.print("Ingrese la base del rectangulo: ");
                                    baseR = sc.nextDouble();
                                    System.out.print("Ingrese la altura del rectangulo: ");
                                    alturaR = sc.nextDouble();
                                    geom Rectangulo = new geom(alturaR,baseR);
                                    System.out.println("El area del rectangulo es: " + Rectangulo.calcular_areaRectagulo(Rectangulo));
                                }
                                break;
                                case 3: {
                                    System.out.println("\t3. Paralelogramo");
                                    double basePa, alturaPa;
                                    //Solicitud de datos
                                    System.out.print("Ingrese la base del paralelogramo: ");
                                    basePa = sc.nextDouble();
                                    System.out.print("Ingrese la altura del paralelogramo: ");
                                    alturaPa = sc.nextDouble();
                                    geom Paralelogramo = new geom(alturaPa, basePa);
                                    System.out.println("El area del paralelogramo es: " + dc.format(Paralelogramo.calcular_areaParalelogramo(Paralelogramo)));
                                }
                                break;
                                case 4: {
                                    System.out.println("\t4. Triangulo");
                                    double baseTr, alturaTr;
                                    //Solicitud de datos
                                    System.out.print("Ingrese la base del triangulo: ");
                                    baseTr = sc.nextDouble();
                                    System.out.print("Ingrese la altura del triangulo: ");
                                    alturaTr = sc.nextDouble();
                                    geom aTriangulo = new geom(alturaTr, baseTr);
                                    System.out.println("El area del triangulo es: " + dc.format(aTriangulo.areaTriangulo(aTriangulo)));
                                }
                                break;
                                case 5: {
                                    System.out.println("\t5. Triangulo Equilatero");
                                    double baseR, alturaR;
                                    //Solicitud de datos
                                    System.out.print("Ingrese la base del Triangulo Equilatero: ");
                                    baseR = sc.nextDouble();
                                    System.out.print("Ingrese la altura del Triangulo Equilatero: ");
                                    alturaR = sc.nextDouble();
                                    geom aTrianEq = new geom(alturaR, baseR);
                                    System.out.println("El area del triangulo equilatero es: " + dc.format(aTrianEq.calcular_areaTriangulo(aTrianEq)));
                                }
                                break;
                                case 6: {
                                    System.out.println("\t6. Rombo");
                                    double diagonalMa, diagonalMe;
                                    //Solicitud de datos
                                    System.out.print("Ingrese la diagonal Mayor: ");
                                    diagonalMa = sc.nextDouble();
                                    System.out.print("Ingrese la diagonal Menor: ");
                                    diagonalMe = sc.nextDouble();
                                    geom aRombo = new geom(diagonalMa, diagonalMe);
                                    System.out.println("El area del Rombo es: " + dc.format(aRombo.areaRombo(aRombo)));
                                }
                                break;
                                case 7: {
                                    System.out.println("\t7. Poligono Regular");
                                    int nLados;
                                    double apotema, ladoPol;
                                    //Solicitud de datos
                                    System.out.print("Ingrese el numero de lados: ");
                                    nLados = sc.nextInt();
                                    System.out.print("Ingrese el apotema: ");
                                    apotema = sc.nextDouble();
                                    System.out.print("Ingrese la longitud de un lado: ");
                                    ladoPol = sc.nextDouble();
                                    geom Poligono = new geom(nLados, ladoPol ,apotema);
                                    System.out.println("El area del Poligono Regular es: " + dc.format(Poligono.calcular_areaPoligono(Poligono)));
                                }
                                break;
                                case 8: {
                                    System.out.println(VERDE + "\n\t\tVolviendo al menu principal...." + RESET);
                                    pausaA = true;
                                }
                                break;
                            }
                        }
                    }break;
                    case 2:{
                        boolean pausaP = false;//Variable de finalizacion del ciclo while

                        while(!pausaP){
                            int opP = menuFiguras();//Ingreso de la opcion del menu figuras "Perimetros"

                            switch (opP) {
                                case 1: {
                                    System.out.println("\t1. Cuadrado");
                                    double ladoPCu;//Variable del lado para el perimetro del cuadrado
                                    System.out.print("Ingrese el lado del cuadrado: ");
                                    ladoPCu = sc.nextDouble();
                                    geom Migeom = new geom(ladoPCu);
                                    System.out.println("El perimetro del cuadrado es: " + dc.format(Migeom.perimetroCuadrado(Migeom)));
                                }
                                break;
                                case 2: {
                                    System.out.println("\t2. Rectangulo");
                                    double baseR, alturaR;
                                    //Solicitud de datos
                                    System.out.print("Ingrese la base del rectangulo: ");
                                    baseR = sc.nextDouble();
                                    System.out.print("Ingrese la altura del rectangulo: ");
                                    alturaR = sc.nextDouble();
                                    geom Rectangulo = new geom(alturaR,baseR);
                                    System.out.println("El area del rectangulo es: " + Rectangulo.calcular_perimetroRectagulo(Rectangulo));
                                }
                                break;
                                case 3: {
                                    System.out.println("\t3. Paralelogramo");
                                    double basePa, alturaPa;
                                    //Solicitud de datos
                                    System.out.print("Ingrese la base del paralelogramo: ");
                                    basePa = sc.nextDouble();
                                    System.out.print("Ingrese la altura del paralelogramo: ");
                                    alturaPa = sc.nextDouble();
                                    geom Paralelogramo = new geom(alturaPa, basePa);
                                    System.out.println("El perimetro del Paralelogramo es: " + dc.format(Paralelogramo.calcular_perimetroParalelogramo(Paralelogramo)));
                                }
                                break;
                                case 4: {
                                    System.out.println("\t4. Triangulo");
                                    double ladoPTr, ladoPTr2 = 0, ladoPTr3;
                                    geom pTriangulo = new geom();
                                    for (int i = 0; i < 3; i++){
                                        System.out.print("Ingrese el lado"+ (i+1) +" del Triangulo: ");
                                        ladoPTr = sc.nextDouble();
                                        pTriangulo.setLado(ladoPTr);
                                        ladoPTr2 = ladoPTr2 + pTriangulo.getLado();
                                    }
                                    System.out.println("\tEl perimetro del triangulo es: " + dc.format(ladoPTr2));
                                }
                                break;
                                case 5: {
                                    System.out.println("\t5. Triangulo Equilatero");
                                    double ladoPEq;
                                    System.out.print("Ingrese el lado del Equilatero: ");
                                    ladoPEq = sc.nextDouble();
                                    geom pTriaEq = new geom(ladoPEq);
                                    System.out.println("El perimetro del Triangulo Equilatero es: " + dc.format(pTriaEq.calcular_perimetroTriangulo(pTriaEq)));
                                }
                                break;
                                case 6: {
                                    System.out.println("\t6. Rombo");
                                    double ladoPRo, perRombo = 0;
                                    for (int i = 0; i < 4; i++){
                                        System.out.print("Ingrese el lado " + (i + 1) + " del Rombo: ");
                                        ladoPRo = sc.nextDouble();
                                        perRombo = perRombo + ladoPRo;
                                    }
                                    System.out.println("\tEl perimetro del cuadrado es: " + dc.format(perRombo));
                                }
                                break;
                                case 7: {
                                    System.out.println("\t7. Poligono Regular");
                                    int nLados;
                                    double apotema, ladoPol;
                                    //Solicitud de datos
                                    System.out.print("Ingrese el numero de lados: ");
                                    nLados = sc.nextInt();
                                    System.out.print("Ingrese el apotema: ");
                                    apotema = sc.nextDouble();
                                    System.out.print("Ingrese la longitud de un lado: ");
                                    ladoPol = sc.nextDouble();
                                    geom Poligono = new geom(nLados, ladoPol ,apotema);
                                    System.out.println("El perimetro del Poligono Regular es: " + dc.format(Poligono.calcular_perimetroPoligono(Poligono)));
                                }
                                break;
                                case 8: {
                                    System.out.println(VERDE + "\n\t\tVolviendo al menu principal...." + RESET);
                                    pausaP = true;
                                }
                                break;
                            }
                        }
                    }break;
                    case 3:{
                        boolean pausaV = false;//Variable de finalizacion del ciclo while

                        while(!pausaV){
                            int opV = menuFiguras_volumenes();//Menu de las figuras para sacar el volumen
                            switch (opV) {
                                case 1: {
                                    System.out.println("\t1. Piramide");
                                    double aristaPi;
                                    //Solicitud de datos
                                    System.out.print("Ingrese el arista de la Piramide: ");
                                    aristaPi = sc.nextDouble();
                                    geom Piramide = new geom(aristaPi);
                                    System.out.println("El volumen de la piramide es: " + dc.format(Piramide.calcularVolumenPiramide(Piramide)));
                                }
                                break;
                                case 2: {
                                    System.out.println("\t2. Cubo");
                                    double aristaPCu;
                                    //Solicitud de datos
                                    System.out.print("Ingrese el arista del Cubo: ");
                                    aristaPCu = sc.nextDouble();
                                    geom Cubo = new geom(aristaPCu);
                                    System.out.println("El volumen del cubo es: " + dc.format(Cubo.calcularVolumenCubo(Cubo)));
                                }
                                break;
                                case 3: {
                                    System.out.println("\t3. Octaedro");
                                    double aristaPOc;
                                    //Solicitud de datos
                                    System.out.print("Ingrese el arista del Octaedro: ");
                                    aristaPOc = sc.nextDouble();
                                    geom Octaedro = new geom(aristaPOc);
                                    System.out.println("El volumen del Octaedro es: " + dc.format(((Octaedro.calcularVolumenOctaedro(Octaedro)))));
                                }
                                break;
                                case 4: {
                                    System.out.println("\t4. Cilindro");
                                    double alturaVCi, radioVCi;
                                    //Solicitud de datos
                                    System.out.print("Ingrese el radio base del cilindro: ");
                                    radioVCi = sc.nextDouble();
                                    System.out.print("Ingrese la altura del cilindro: ");
                                    alturaVCi = sc.nextDouble();
                                    geom Cilindro = new geom(alturaVCi,radioVCi);
                                    System.out.println("El volumen del Cilindro es: " + (dc.format(Cilindro.calcularVolumenCilindro(Cilindro))));
                                }
                                break;/*
                                case 5: {
                                    System.out.println("\t5. Cono");
                                    double alturaVCo, radioVCo;
                                    //Solicitud de datos
                                    System.out.print("Ingrese el radio base del Cubo: ");
                                    radioVCo = sc.nextDouble();
                                    System.out.print("Ingrese la altura del Cubo: ");
                                    alturaVCo = sc.nextDouble();
                                    System.out.println("El volumen del Cilindro es: " + (dc.format((pi * Math.pow(radioVCo,2) * alturaVCo)/3)));

                                }
                                break;
                                case 6: {
                                    System.out.println("\t6. Esfera");
                                    double radioVEs;
                                    System.out.print("Ingrese el radio de la esfera: ");
                                    radioVEs = sc.nextDouble();
                                    calculo.setDatoDouble1(radioVEs);
                                    System.out.println("EL volumen de la Esfera es: " + (dc.format((4*pi*Math.pow(calculo.getDatoDouble1(),3))/3)));
                                }
                                break;
                                case 7: {
                                    System.out.println("\t7. Paralelepipedo");
                                    double largoVPa, anchoVPa, alturaVPa;
                                    System.out.print("Ingrese el largo: ");
                                    largoVPa = sc.nextDouble();
                                    calculo.setDatoDouble1(largoVPa);
                                    System.out.print("Ingrese el ancho: ");
                                    anchoVPa = sc.nextDouble();
                                    calculo.setDatoDouble2(anchoVPa);
                                    System.out.print("Ingrese la altura: ");
                                    alturaVPa = sc.nextDouble();
                                    calculo.setDatoDouble3(alturaVPa);
                                    System.out.println("El volumen del Paralelepipedo es: " + (dc.format(calculo.getDatoDouble1() * calculo.getDatoDouble2() * calculo.getDatoDouble3())));
                                }
                                break;*/
                                case 8: {
                                    System.out.println(VERDE + "\n\t\tVolviendo al menu principal...." + RESET);
                                    pausaV = true;
                                }
                                break;
                            }
                        }
                    }break;
                    case 4:{
                        System.out.println(VERDE + "Saliendo...." + RESET);
                        pausa = true;
                    }break;
                }
            }
        } catch (Exception ex) {
            System.out.println(ROJO + "\n\tTipo de dato ingresado incorrectamente!!!" + ex.getLocalizedMessage() + RESET);
        } finally {
            System.out.println(VERDE + "Programa Finalizado..." + RESET);
        }

    }
    public static int menuPrincipal(){
        int opPrincipal = 0;//Variable para el menu
        System.out.println("\t\t\t\t*** MENU ***");
        System.out.println("1. Areas");
        System.out.println("2. Perimetros");
        System.out.println("3. Volumenes");
        System.out.println("4. Salir");
        System.out.print("Opcion?: ");
        opPrincipal = sc.nextInt();
        while((opPrincipal < 1) || (opPrincipal > 4)){
            System.out.print("Ingrese una opcion entre 1-4: ");
            opPrincipal = sc.nextInt();
        }
        return opPrincipal;
    }

    public static int menuFiguras(){//Menu de figuras disponible para el calculo de areas y perimetros
        int opFiugras = 0;//Variable para el menu
        System.out.println("\t\t\t\t*** MENU PARA AREAS Y PERIMETROS DE LAS SIGUIENTES FIUGRAS ***");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectangulo");
        System.out.println("3. Paralelogramo");
        System.out.println("4. Triangulo");
        System.out.println("5. Triangulo Equilatero");
        System.out.println("6. Rombo");
        System.out.println("7. Poligono Regular");
        System.out.println("8. Salir");
        System.out.print("Opcion?: ");
        opFiugras = sc.nextInt();
        while((opFiugras < 1) || (opFiugras > 8)){
            System.out.print("Ingrese una opcion entre 1-8: ");
            opFiugras = sc.nextInt();
        }
        return opFiugras;
    }

    public static int menuFiguras_volumenes(){//Menu de figuras disponibles para calcular el volumen
        int opPerimetros = 0;
        System.out.println("\t\t\t\t*** MENU PARA VOLUMENES DE LAS SIGUIETNES FIGURAS ***");
        System.out.println("1. Piramide");
        System.out.println("2. Cubo");
        System.out.println("3. Octaedro");
        System.out.println("4. Cilindro");
        System.out.println("5. Cono");
        System.out.println("6. Esfera");
        System.out.println("7. Paralelepipedo");
        System.out.println("8. Salir");
        System.out.print("Opcion?: ");
        opPerimetros = sc.nextInt();
        while((opPerimetros < 1) || (opPerimetros > 8)){
            System.out.print("Ingrese una opcion entre 1-8: ");
            opPerimetros = sc.nextInt();
        }
        return opPerimetros;
    }
}