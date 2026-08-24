class Student {

    // Instance Fields (Member Variables)

    int id;

    String name;

    int marks;


    // Instance Methods (Member Functions)

    void displayStudent() {

        System.out.println("ID: " + id);

        System.out.println("Name: " + name);

        System.out.println("Marks: " + marks);

    }


    int getMarks() {

        return marks;

    }

}




class App1 {

    public static void main(String[] args) {

        Student s1 = new Student();

        // s1 is a reference

        // new Student() creates an object


        // Default values

        s1.displayStudent();


        // Assign values

        s1.id = 10;

        s1.name = "Sachin";

        s1.marks = 99;


        s1.displayStudent();

        System.out.println(s1.getMarks());

    }

}