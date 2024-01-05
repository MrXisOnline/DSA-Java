class Student{
    String name;
    int age;
    public Student(String n, int a){
        name = n;
        age = a;
    }
    public String toString(){
        return name + " " + age;
    }
}

class student_array {
    public static void main(String[] args) {
        Student[] starr = {new Student("Suraj", 22), new Student("Prem", 21), new Student("Kapil", 25)};
        for (Student x: starr){
            System.out.println(x);
        }
    }
}
