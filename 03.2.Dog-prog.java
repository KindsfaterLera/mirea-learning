public abstract class Dog{

    private String name;
    private String breed;
    private String color;
    private int age;

    public Dog(String name, int age){
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
    public String getColor(){
        return color;
    }
    public int setAge(){
        return age*7;
    }

    public String ToString(){
        System.out.println("Name is " + name + ", dog breed is " + breed +  ", dog color is " + color + ", dog age is " + age);
    }
}
