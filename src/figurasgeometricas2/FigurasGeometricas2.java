/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas2;

import java.util.Scanner;

/**
 *
 * @author Johan steven castillo guateque
 */
public class FigurasGeometricas2 {

    private Scanner teclado;
    
    /**
     * Constructor de la clase
     */
    public FigurasGeometricas2() {
        teclado = new Scanner(System.in);        
        mensajeBienvenida();
        iniciar();
    }
    
    /**
     * Metodo que da la bienvenida al programa
     */
    private void mensajeBienvenida(){
        System.out.println("------BIENVENIDO-----");
        System.out.println("------JG-----");
    }
    
    /**
     * Metodo que da inicio al menu de opciones
     */
    private void iniciar() {        
        while(true) {
            System.out.println("1. Triangulo 2.Circulo 3.Cuadrado 4.Salir");
            byte opcion =  teclado.nextByte();
            if(opcion == 1) {
                inicicarTriangulo();
            } else if(opcion == 2) {
                iniciarCirculo();
            } else if(opcion == 3) {
                iniciarCuadrilatero();
            } else if(opcion == 4) {
                break;
            } else {
                System.out.println("Numero no valido");
            }
            
        }
    }
    
    /**
     * Metodo que toma las cordenadas del triangulo y llama al objeto para las operaciones
     */
    private void inicicarTriangulo(){
        double x, y;
        System.out.println("Digite lado x1");
        x = teclado.nextDouble();
        System.out.println("Digite lado y1");
        y = teclado.nextDouble();
        Punto punto1 = new Punto(x, y);
        System.out.println("Digite lado x2");
        x = teclado.nextDouble();
        System.out.println("Digite lado y2");
        y = teclado.nextDouble();
        Punto punto2 = new Punto(x, y);
        System.out.println("Digite lado x3");
        x = teclado.nextDouble();
        System.out.println("Digite lado y3");
        y = teclado.nextDouble();
        Punto punto3 = new Punto(x, y);
        Triangulo triangulo = new Triangulo(punto1, punto2, punto3);
        triangulo.darResultados();
        //triangulo.darTipoTriangulo();
       
    }
    /**
     * metodo que toma las coordenadas del circulo y llama al objeto para hacer las operaciones 
     */
    private void iniciarCirculo(){
        double x, y;
        System.out.println("digite la coordenada x1 ");
        x = teclado.nextDouble();
        System.out.println("digite la coordenada y1 ");
        y = teclado.nextDouble();
        Punto punto1 = new Punto(x, y);
        System.out.println("digite la coorenada x2 ");
        x = teclado.nextDouble();
        System.out.println("digite la coordenada y2 ");
        y = teclado.nextDouble();
        Punto punto2 = new Punto (x, y);
        Circulo circulo = new Circulo(punto1,punto2);
        circulo.darResultadosC();
        
    }
    /**
     * metodo que toma las coordenadas del cuadrilatero y llama al objeto para hacer las operaciones
     */
    private void iniciarCuadrilatero(){
        double x, y;
        System.out.println("digite la coordenada x1 ");
        x = teclado.nextDouble();
        System.out.println("digite la coordenada y1 ");
        y = teclado.nextDouble();
        Punto punto1 = new Punto(x, y);
        System.out.println("digite la coordenada x2 ");
        x = teclado.nextDouble();
        System.out.println("digite la coordenada y2 ");
        y = teclado.nextDouble();
        Punto punto2 = new Punto(x, y);
        System.out.println("digite la coordenada x3 ");
        x = teclado.nextDouble();
        System.out.println("digite la coordenada y3 ");
        y = teclado.nextDouble();
        Punto punto3 = new Punto(x, y);
        System.out.println("digite la coordenada x4 ");
        x = teclado.nextDouble();
        System.out.println("digite la coordenada y4 ");
        y = teclado.nextDouble();
        Punto punto4 = new Punto(x, y);
        Cuadrilatero cuadro = new Cuadrilatero(punto1,punto2,punto3,punto4);
        cuadro.darResultados();
    }

}
