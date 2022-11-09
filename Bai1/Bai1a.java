package BTbuoi4.Bai1;

public class Bai1a {

    static student []themSinhVien(student[] students,student student){
        student[] newStudent=new student[students.length+1];
        for (int index=0;index<students.length;index++)
        {
            newStudent[index]=students[index];
        }
        for (int index = 0; index< students.length; index++)
        {   if (students[index].getId()!=(student.getId()))
        {
            newStudent[newStudent.length-1]=student;
        }else{
            System.out.println("Can not add!");
        }

        }
        return newStudent;

    }
}
