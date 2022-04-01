public class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Hello, from " + getName());
    }

    public static void main(String[] args) {
        Person firstPerson = new Person("Jer");
        System.out.println(firstPerson.getName());

        //Prints true for .equals as they are same value
        //prints false for == as different objects
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

        //prints true as same object
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        //After person2.setName person1 becomes jane as well, unsure of why
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());


    }
}


