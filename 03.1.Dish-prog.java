public abstract class Dish{

    private String shape;
    private String color;
    private int diameter;

    public Dog(String shape, string color, int diameter){
        this.shape = shape;
        this.color = color;
        this.diameter = diameter;
    }

    public String getShape(){
        return shape;
    }
    public String getColor(){
        return color;
    }
    public int setDiameter(){
        return diameter;
    }

    public String ToString(){
        System.out.println("Shape is " + shape + ", color is " + color + ", diameter is " + diameter);
    }
}
