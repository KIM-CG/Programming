package KCG;

class Person {
    protected void speak() {
        System.out.println("말하기");
    }
    protected void eat() {
        System.out.println("먹기");
    }
    protected void walk() {
        System.out.println("걷기");
    }
    protected void sleep() {
        System.out.println("잠자기");
    }
}

class Student extends Person {
    public void Student() {
        System.out.println("\nStudent : ");
        speak();
        eat();
        walk();
        sleep();
        study();
    }
    void study() {
        System.out.println("공부하기");
    }
}

class StudentWorker extends Person {
    public void StudentWorker() {
        System.out.println("\nStudentWorker : ");
        speak();
        eat();
        walk();
        sleep();
        study();
        working();
    }
    void study() {
        System.out.println("공부하기");
    }
    void working() {
        System.out.println("일하기");
    }
}

class Researcher extends Person {
    public void Researcher() {
        System.out.println("\nResearcher : ");
        speak();
        eat();
        walk();
        sleep();
        researcher();
    }
    void researcher() {
        System.out.println("연구하기");
    }
}

class Professor extends Person {
    public void Professor() {
        System.out.println("\nProfessor : ");
        speak();
        eat();
        walk();
        sleep();
        researcher();
        teaching();
    }
    void researcher() {
        System.out.println("연구하기");
    }
    void teaching() {
        System.out.println("가르치기");
    }
}


public class Var_2 {

    public static void main(String[] args) {
        Student student = new Student();
        StudentWorker studentworker = new StudentWorker();
        Researcher researcher = new Researcher();
        Professor professor = new Professor();
        student.Student();
        studentworker.StudentWorker();
        researcher.Researcher();
        professor.Professor();
    }
}
