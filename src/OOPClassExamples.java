import java.util.Scanner;

class Post{
    private String author;
    private String title;
    private String postBody;
    private String createdDate;

    public String getPost(){
        return "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Post: " + postBody + "\n" +
                "Date: " + createdDate + "\n";
    }
    public String updatePost(String title,String author,String postBody,String createdDate){
        this.title = title;
        this.author = author;
        this.postBody = postBody;
        this.createdDate = createdDate;

        return this.getPost();
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public void setPostBody(String postBody) {
        this.postBody = postBody;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

//class Person {
//    public String firstName;
//    public String lastName;
//    private int age;
//    public static long totalPeople = 0;
//
//    public static String description =
//            "Object represents a person.";
//
//    public Person() {}
//
//    public Person(String first, String last) {
//        this.firstName = first;
//        this.lastName = last;
//    }
//
//    public static String getDescription() {
//        return description;
//    }
//
//    public String sayHello() {
//        return String.format("Hello from %s %s!",
//                firstName, lastName);
//    }
//
//    public void setAge(int age) { this.age = age; }
//    public int getAge() { return age; }
//}
//
//public class OOPClassExamples {
//    public static void main(String[] args) {
//        Post firstPost = new Post();
//
//        firstPost.setAuthor("JS");
//        firstPost.setPostBody("Post body");
//        firstPost.setTitle("HELLO TITLE");
//        firstPost.setCreatedDate("WHEN?");
////        firstPost.author = "JS";
////        firstPost.title = "Example Title";
////        firstPost.postBody = "this is the body text";
////        firstPost.createdDate = "03/30/2022";
//
//        System.out.println("First post: \n" + firstPost.getPost());
//
//        String updatedPost = firstPost.updatePost("Updated title","Updated author","updated body","updated Date");
//
//        System.out.println("updatedPost = \n" + updatedPost);
//
//        Post secondPost = new Post();
//
//        secondPost.updatePost("Second post title","second post author","second post body text","second post created date");
//
//        System.out.println("secondPost.getPost() = \n" + secondPost.getPost());
//
//        // 1. Created a class called post. Which is responsible for creating new posts.
//        // 2 .We created field in that class with public visibility. meaning that everyone has access to this value
//        // 3. We used encapsulation by storing our data and methods related to the class inside it.
//
//        // People class!
//
//        Person firstPerson = new Person("Justin","Reich");
//
//        System.out.println("firstPerson.sayHello() = " + firstPerson.sayHello());
//
//        Person secondPerson = new Person();
//
//        secondPerson.firstName = "Dane";
//        secondPerson.lastName = "Miller";
////        secondPerson.age = 34; can't set age this way
//        secondPerson.setAge(34); // must set age this way as age is set to private.
//
//
//        System.out.println("secondPerson.sayHello() = " + secondPerson.sayHello());
//        System.out.println("secondPerson.getAge() = " + secondPerson.getAge());
//
//    }
//}
