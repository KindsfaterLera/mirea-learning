class Book {

    private String author, name;

    public Book(String author, String name){
        this.author = author;
        this.name = name;
    }

    public String getAge() {
        return name;
    }

    public String getName() {
        return author;
    }

    public String ToString() {
        System.out.println("The author of the book is " + author + " and it is called " + name);
    }
}
