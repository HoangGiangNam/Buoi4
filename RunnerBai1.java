package BTbuoi4;

public class RunnerBai1 {
    public static void main(String[] args) {
        student s1= new student(1,"công nghệ","công nghệ");
        student s2= new student(2,"máy tính","Nguyen Hoa");
        student s3= new student(13,"khoa học","Hoang Hung");
        student s4= new student(3,"hàng không","Hoang Siêu");
        student s5= new student(4,"lập trình","Nguyen Nam");
        student s6= new student(5,"nghiên cư","Le Hoa");

        System.out.println("In ra mảng:");
        student[] students={s1,s2,s3,s4,s5,s6};
        for (int i=0;i<students.length;i++){
            System.out.println(students[i]);
        }



    }
}
