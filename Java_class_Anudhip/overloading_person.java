package solve_problems.Java_class_Anudhip;
public class overloading_person {
    String name;
    int age;    
    overloading_person() {
        name = "Unknown";
        age = 0;
    }  
    overloading_person(String name) {
        this.name = name;
        age = 0;
    }
    // Constructor 3
    overloading_person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println();
    }
    public static void main(String[] args) {
        overloading_person p1 = new overloading_person();
        overloading_person p2 = new overloading_person("Ellappan");
        overloading_person p3 = new overloading_person("Kumar", 25);
        p1.display();
        p2.display();
        p3.display();
    }
}    

