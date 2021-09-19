package Lab3.java;

public class Reсtangle extends Shape {
    protected double width;
    protected double length;

    public Reсtangle(){
        super();
    }
    public Reсtangle(double width, double length){
        this.length = length;
        this.width = width;
    }
    public Reсtangle(double width, double length, String color, boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }

    public double getWidth(){
        return this.width;
    }
    public double getLength(){
        return this.length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;
    }

    @Override
    public double getArea(){
        double r = width*length;
        return r;
    }
    @Override
    public  double getPerimeter(){
        double r = 2*(width+length);
        return r;
    }


    @Override
    public String toString() {
        return "Reсtangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}

