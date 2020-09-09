class Dog{

    private String name;
    private int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int setAge(){
        return age*7;
    }

    public String ToString(){
        System.out.println("Name is " + name + "; dog age is " + age);
    }
}
