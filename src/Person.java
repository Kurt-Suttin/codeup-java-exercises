public class Person {

    ///INSTANCE PROPERTIES
    private String name;

    //// constructor///
    public Person(String name) {
        this.name = name;
    }

    ;
//    public Person(String name){
//        this.name = name;
//    }
//


    //////////////METHODS
    public String getName() {
//TODO: return the person's name
        return this.name;

    }

    public void setName(String name) {
//TODO: change the name field to the passed value
        this.name = name;

    }

    public void sayHello() {
//TODO: print a message to the console using the person's name
        System.out.println("Hello " + this.name);
    }


}
