/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas2;

/**
 *
 * @author johan steven castillo guateque
 */
public class Cuadrilatero {
    /**
     * atributo que contiene la coordenada x1 y1
     */
    private Punto punto1;
    /**
     * atributo que contiene la coordenada x2 y2
     */
    private Punto punto2;
    /**
     * atributo que contiene la coordenada x3 y3 
     */
    private Punto punto3;
    /**
     * atributo que contiene la coordenada x4 y4  
     */
    private Punto punto4;
/**
 * constructor de la clase que inicializa los valores de los atributos 
 * @param punto1
 * @param punto2
 * @param punto3
 * @param punto4 
 */
    public Cuadrilatero(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
        this.punto4 = punto4;
    }
    /**
     * metodo que retorna el valor del lado a
     * @return 
     */
    private double darLado1(){
        double auxX = Math.pow(punto2.getX() - punto1.getX(), 2);
        double auxY = Math.pow(punto2.getY() - punto1.getY(), 2);
        double lado = Math.sqrt(auxX +  auxY);
        return lado;
    }
    /**
     * metodo que retorna el valor del lado B
     * @return 
     */
    private double darLado2(){
        double auxX = Math.pow(punto3.getX() - punto2.getX(), 2);
        double auxY = Math.pow(punto3.getY() - punto2.getY(), 2);
        double lado = Math.sqrt(auxX + auxY );
        return lado;
    }
    /**
     * metodo que retorna el valor del lado C
     * @return 
     */
    private double darLado3(){
        double auxX = Math.pow(punto4.getX() - punto3.getX(), 2);
        double auxY = Math.pow(punto4.getY() - punto3.getY(), 2);
        double lado = Math.sqrt(auxX + auxY);
        return lado;
    }
    /**
     * metodo que retorna el valor del lado d
     * @return 
     */
    private double darLado4(){
        double auxX = Math.pow(punto1.getX() - punto4.getY(), 2);
        double auxY = Math.pow(punto1.getY() - punto4.getY(), 2);
        double lado = Math.sqrt(auxX + auxY);
        return lado;
    }
    /**
     * metodo que da los resultados del cuadrilatero 
     */
    public void darResultados(){
        if(isCuadrado()){
            System.out.println("ES UN CUADRADO");
            System.out.println("EL LADO A MIDE "+darLado1()+" unidades");
            System.out.println("EL LADO B MIDE "+darLado2()+" unidades");
            System.out.println("EL LADO C MIDE "+darLado3()+" unidades");
            System.out.println("EL LADO D MIDE "+darLado4()+" unidades");
            System.out.println("EL PERIMETRO ES "+darPerimetro()+"unidades ");
            System.out.println("EL AREA ES "+darArea()+"unidades cuadradas");
        }else{
        if(isRectangulo()){
            System.out.println("ES UN RECTANGULO");
            System.out.println("EL LADO A MIDE "+darLado1()+" unidades");
            System.out.println("EL LADO B MIDE "+darLado2()+" unidades");
            System.out.println("EL LADO C MIDE "+darLado3()+" unidades");
            System.out.println("EL LADO D MIDE "+darLado4()+" unidades");
            System.out.println("EL PERIMETRO ES "+darPerimetro()+"unidades ");
            System.out.println("EL AREA ES "+darArea()+"unidades cuadradas");       
        }else{
            System.out.println("NO ES RECTANGULO NI TAMPOCO ES CUADRADO");}
        }
                
    }
    /**
     * metodo que retorna el perimetro del cuadrilatero 
     * @return 
     */
    private double darPerimetro(){
        return (darLado1()+darLado2()+darLado3()+darLado4());
    }
    /**
     * metodo que retorna el area del cuadrilatero
     * @return 
     */
    private double darArea(){
        return(darLado2()*darLado3());
    }
    /**
     * retorna true si es un rectangulo de lo contrario false 
     * @return 
     */
    private boolean isRectangulo(){
        if((darLado1() == darLado3())||(darLado1() == darLado2()) || (darLado1() == darLado4() )){
        return(true);
        }else{
        return(false);
        }
    }
    /**
     * retorna true si es un cuadrado ó false de lo contrario
     * @return 
     */
    private boolean isCuadrado(){
        if((darLado1() == darLado3())&&(darLado1() == darLado2()) && (darLado1() == darLado4() )){
        return(true);
        }else{
        return(false);
        }
    }
/**
 * retorna la coordnada x1 y1
 * @return 
 */
    public Punto getPunto1() {
        return punto1;
    }
    /**
     * modifica el valor de la coordenada x1 y1
     * @param punto1 
     */

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }
    /**
     * retorna el valor de la coordenada x2 y2 
     * @return 
     */
    public Punto getPunto2() {
        return punto2;
    }
    /**
     * modifica el valor de la coordenada x2 y2
     * @param punto2 
     */

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }
    /**
     * retorna el valor de la coordenada x3 y3 
     * @return 
     */

    public Punto getPunto3() {
        return punto3;
    }
    /**
     * modifica el valor de la coordenada x3 y3 
     * @param punto3 
     */

    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }
    /**
     * retorna el valor de la coordenada x4 y4
     * @return 
     */

    public Punto getPunto4() {
        return punto4;
    }
    /**
     * modifica el valor e la coordenada x4 y4 
     * @param punto4 
     */

    public void setPunto4(Punto punto4) {
        this.punto4 = punto4;
    }
    
}
