package task2;

public class Person {
    // Created variables for age and name
    private int age;
    private String name;
    // Method overloading : Created a method which will accept the name and kept default age as 18
    public void person( String name) {
        this.age = 18;
        this.name = name;
    }
    // Created a method which will accept the name and age
    public void person( String name,int age) {
        this.age = age;
        this.name = name;
    }

    public void printName(){
        System.out.print(this.name+" "+this.age);
        System.out.println();
    }
     public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person();
        p1.person("james",25);
        p2.person("john");
        p1.printName();
        p2.printName();
     }
}

//OUTPUT:
//"C:\Program Files\Java\jdk-22\bin\java.exe" "-javaagent:C:\Users\WELCOME\AppData\Local\JetBrains\IntelliJ IDEA 2024.2.0.2\lib\idea_rt.jar=61494:C:\Users\WELCOME\AppData\Local\JetBrains\IntelliJ IDEA 2024.2.0.2\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\WELCOME\IdeaProjects\Task\out\production\Task task2.Person
//James 25
//John 18
//
//Process finished with exit code 0