package polymorphismAssignment;

class Shape{
	private String color;
	
	public Shape(String color){
		this.color = color;
	}

	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}
	
	public double getArea() {
        System.out.println("Area of a Shape: ");
        return 0;
    }
}

class Rectangle extends Shape{
    private int length;
    private int width;
    
    public Rectangle(String color, int length, int width){
    	super(color);
    	this.length = length;
    	this.width = width;
    }
	
    @Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", toString()=" + super.toString() + ", getArea()="
				+ getArea() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	public double getArea() {
        System.out.println("Area of a Rectangle: ");
        return length*width;
    }
}

class Triangle extends Shape{
	private int base;
	private int height;
	
	Triangle(String color, int base, int height){
		super(color);
		this.base = base;
		this.height = height;
	}
	
	
		
	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}



	public double getArea() {
        System.out.println("Area of a Triangle: ");
        return 0.5*(base*height);
	}
    
}	


public class Q1 {

	public static void main(String[] args) {
        Shape rect = new Rectangle("yellow", 4, 5);
        double A = rect.getArea();
        System.out.println(A);
        
        Shape tri = new Triangle("blue", 3, 6);
        double B = tri.getArea();
        System.out.println(B);
        

	}
}
