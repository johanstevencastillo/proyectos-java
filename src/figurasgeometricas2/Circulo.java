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
public class Circulo {
    /**
     * atributo que contiene la coordenada x1,y1
     */
    private Punto  punto1;
    /**
     * atributo que contiene la cordenada x2,y2
     */
    private Punto punto2;
/**
 * cosntructor de la clase inicializando valores 
 * @param punto1
 * @param punto2 
 */
    public Circulo(Punto punto1, Punto punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }
    /**
     * Metodo que da los resultados de un triangulo
     */
    public void darResultadosC(){
        if(isCirculo()== true){
            System.out.println("EL RADIO DEL CIRCULO ES : "+darRadio());
            System.out.println("EL AREA DEL CIRCULO ES : "+darAreaC());
            System.out.println("EL PERIMETRO DEL CIRCULO ES : "+darPerimetroC());
        }else{
            System.out.println("ERROR!!!!   NO ES UN CIRCULO ");
        }
        
    }
    /**
     * retorna verdadero si es un circulo o falso si no es circulo
     * @return 
     */
    private boolean isCirculo(){
        if((punto1.getX() == punto2.getX()) && (punto1.getY() == punto2.getY())){
            return(false);
        }else{
            return (true);
        }
    }
/**
 * retorna la cordenada x1 y1
 * @return 
 */
    public Punto getPunto1() {
        return punto1;
    }
/**
 * modifica la cordenada x1 y1
 * @param punto1 
 */
    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }
/**
 * retorna la cordenada x2 y2
 * @return 
 */
    public Punto getPunto2() {
        return punto2;
    }
/**
 * modifica la cordenada x2 y2
 * @param punto2 
 */
    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }
    /**
     * retorna el valor del radio 
     * @return 
     */
    private double darRadio(){
        double auxX = Math.pow(punto2.getX() - punto1.getX(), 2);
        double auxY = Math.pow(punto2.getY() - punto1.getY(), 2);
        double radio = Math.sqrt(auxX +  auxY);
        return radio;
    }
    /**
     * retorna el valor del perimetro del circulo
     * @return 
     */
    private double darPerimetroC(){
        return(this.darRadio()*Math.PI);
        
    }
    
    /**
     * retorna el area del circulo
     * @return 
     */
     private double darAreaC(){
       return(Math.pow(this.darRadio(), 2)*Math.PI);
   }
}
