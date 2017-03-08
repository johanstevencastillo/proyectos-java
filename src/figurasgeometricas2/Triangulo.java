/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas2;

/**
 * Clase que representa un triangulo con sus operaciones
 * @author Johan steven castillo guateque 
 */
public class Triangulo {
    
    /**
     * Atributo que contiene la cordenada x1 y1
     */
    private Punto punto1;
    
    /**
     * Atributo que contiene la cordenada x2 y2
     */    
    private Punto punto2; 

    /**
     * Atributo que contiene la cordenada x3 y3
     */        
    private Punto punto3;
    
    
    /**
     * Guarda el perimetro del triangulo
     */
    private double perimetro;

    /**
     * Constuctor de la clse que inicializa las variables
     * @param punto1
     * @param punto2
     * @param punto3 
     */
    public Triangulo(Punto punto1, Punto punto2, Punto punto3) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }
    
    /**
     * Metodo que da los resultados del triangulo
     */
    public void darResultados() {
        if(isTriangulo()) {
            System.out.println("Lado1: " + darLado1());
            System.out.println("Lado2: " + darLado2());
            System.out.println("Lado3: " + darLado3());
            System.out.println("Perimetro: " + darPermietro());
            System.out.println("Area: " + darArea());
            darTipoTriangulo();
            
        } else {
            System.out.println("No es un triangulo");
        }    
    }
    
    /**
     * Retorna verdadero si es un triangulo Falso contrario
     * @return 
     */
    private boolean isTriangulo() {
        if(((punto1.getX()==punto2.getX())&&((punto1.getY()==punto2.getY())))&&((punto2.getX() == punto3.getX())&&((punto2.getY()==punto3.getY())))){
        return (false);
        }
        if((punto1.getX()==punto2.getX()) && (punto1.getX()==punto3.getX())){
        return(false);
        }
        if((punto1.getY()==punto2.getY()) && (punto1.getY()==punto3.getY())){
        return(false);
        }else{
        
        
        return true;
    }}
    
    /**
     * Retorma longitud de lado AB
     * @return 
     */
    private double darLado1(){
        double auxiliarX = Math.pow(punto2.getX() - punto1.getX(), 2);
        double auxiliarY = Math.pow(punto2.getY() - punto1.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    
    /**
     * Retorma longitud de lado BC
     * @return 
     */
    private double darLado2(){
        double auxiliarX = Math.pow(punto3.getX() - punto2.getX(), 2);
        double auxiliarY = Math.pow(punto3.getY() - punto2.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    
    /**
     * Retorma longitud de lado CA
     * @return 
     */
    private double darLado3(){
        double auxiliarX = Math.pow(punto1.getX() - punto3.getX(), 2);
        double auxiliarY = Math.pow(punto1.getY() - punto3.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    
    /**
     * 
     * Metodo que retorna el perimetro del triangulo
     * @return Perimetro
     */
    private double darPermietro() {        
        this.perimetro =  darLado1() + darLado2() + darLado3();
        return this.perimetro;
    }
    
    /**
     * Metodo que retorna el area de un trianguo
     * @return  Area
     */
    private double darArea() {
        double semiperimetro = this.perimetro / 2;
        double lado1 = semiperimetro - darLado1();
        double lado2 = semiperimetro - darLado2();
        double lado3 = semiperimetro - darLado3();
        
        double area =  Math.sqrt((semiperimetro * lado1 * lado2 * lado3));
        return area;
    }
    
    /**
     * Metodo que retorna el tipo de triangulo segun la medida de sus lados 
     */
    public void darTipoTriangulo() {
        
        if((darLado1()==darLado2())&&(darLado1()==darLado3())&&(darLado2()==darLado3())){
            System.out.println("ES UN TRIANGULO EQUILATERO");
        }
        if((darLado1()==darLado2()) || (darLado1()==darLado3() ) || (darLado2()==darLado3())){
                System.out.println("ES UN TRIANGULO ISOCELES");
        }
        
        if((darLado1()!=darLado2()) && (darLado1()!=darLado3() ) && (darLado2()!=darLado3())){
            System.out.println("ESS UN TRIANGULO ESCALENO");
        }
    }       
          
    /**
     * Retorna la cordenada x1 y1
     * @return 
     */
    public Punto getPunto1() {
        return punto1;
    }

    /**
     * Modifica la cordenada x1 y1
     * @param punto1 
     */
    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    /**
     * Retorna la cordenada x2 y2
     * @return 
     */    
    public Punto getPunto2() {
        return punto2;
    }

    /**
     * Modifica la cordenada x2 y2
     * @param punto2 
     */    
    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    /**
     * Retorna la cordenada x3 y3
     * @return 
     */    
    public Punto getPunto3() {
        return punto3;
    }

    /**
     * Modifica la cordenada x3 y3
     * @param punto3 
     */    
    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }
    
    
        
    
}
