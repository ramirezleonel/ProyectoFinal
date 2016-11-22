package proyecto.poo;

import com.sun.org.apache.bcel.internal.Constants;

public class Circle {

    private double radio = 1.0;

    public Circle() {
    }

    public Circle(double radio) {
        this.radio = radio;

    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return Math.PI*(radio*radio);
    }
    public double getCircunferencia(){
        return Math.PI*(radio+radio);
    
    }

    @Override
    public String toString() {
        return "Circle :"+'[' + "radio: " + radio +
                ", area "+getArea()+" circunferencia:"+getCircunferencia()+']';
        
    }
    public static void main(String[] args) {
        Circle cir1= new Circle(10);
            System.out.println(cir1);
    }
}
