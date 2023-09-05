public class Triangulo {
    
    /* Atributos */
    private int ladoA;
    private int ladoB;
    private int ladoC;

    /* Construtor */
    public Triangulo(int ladoA, int ladoB, int ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    /* Metodos Classe */
    private boolean ValidarTriangulo(){
        return ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA;
    }
    
    public boolean Equilatero(){
        if(ValidarTriangulo()){
            return ladoA == ladoB && ladoB == ladoC;
        }
        return false;
    } 

    public boolean Escaleno(){
        if(ValidarTriangulo()){
            return ladoA != ladoB && ladoB != ladoC;
        }
        return false;
    } 

    public boolean Isoceles(){
        if(ValidarTriangulo()){
            return ladoA == ladoB || ladoB == ladoC || ladoA == ladoC;
        }
        return false;
    }   

}
