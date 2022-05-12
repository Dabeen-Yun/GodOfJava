package Chap08;

public class ManageStudent {
    public static void main(String args[]){
        Student[] student;
        ManageStudent sample = new ManageStudent();
        student = sample.addStudent();
        sample.printStudents(student);
    }
    public Student[] addStudent(){
        Student[] student=new Student[3];
        student[0] = new Student("Lim");
        student[1] = new Student("Min");
        student[2] = new Student("Sook","Seoul","010xxxxxxxx","ask@godofjava.com");
        return student;
    }
    public void printStudents(Student[] student){//수정필요
        for (int i=0; i<3; i++){
                System.out.println(student[i]);
        }
    }
}
