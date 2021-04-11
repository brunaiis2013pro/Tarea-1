/*
            El triangulo isosceles tiene 2 lados iguales y 1 desigual(base).
            Calcularemos el área y el perímetro del triangulo.
*/
public class TrianguloIsosceles
{
   private double base;
   private double altura;
   private double lado;
   private String color;
    
    public TrianguloIsosceles(double base,double altura,double lado, String color){
        this.base = base;
        this.altura = altura;
        this.lado = lado;
        this.color = color;
    }
    
    public void setBase(double base){
        this.base = base;
    }
    
    public double getBase(){
        return base;
    }
     
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setLado(double lado){
        this.lado = lado;
    }
    
    public double getLado(){
        return lado;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public String getColor(){
        return color;
    }
    
    public double calcularArea(){
        double res;
        
        res = (base*altura)/2;
        
        return res;
    }
    
    public double calcularPerimetro(){
        double res;
        
        res  = (2*lado) + base;
        
        return res;
    }
}
