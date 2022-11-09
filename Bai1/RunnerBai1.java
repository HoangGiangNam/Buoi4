package BTbuoi4.Bai1;

import java.time.LocalDate;

public class RunnerBai1 {
    public static void main(String[] args) {
        student s1 = new student(1, "công nghệ", "công nghệ", LocalDate.parse("2002-03-02"));
        student s2 = new student(2, "máy tính", "Nguyen Hoa", LocalDate.parse("2002-03-02"));
        student s3 = new student(13, "khoa học", "Hoang Hung", LocalDate.parse("2002-03-02"));
        student s4 = new student(3, "hàng không", "Hoang Siêu", LocalDate.parse("2002-03-02"));
        student s5 = new student(4, "lập trình", "Nguyen Nam", LocalDate.parse("2002-03-02"));
        student s6 = new student(5, "nghiên cư", "Le Hoa", LocalDate.parse("2002-03-02"));
        System.out.println("In ra mảng:");
        student[] students = {s1, s2, s3, s4, s5, s6};
        duyetMang(students);
        System.out.println("Sắp xếp mảng:");
        sapXepTheoChieuTangDanCuaTen(students);
        duyetMang(students);
        student s7 = new student(6, "Hoang", "Hond", LocalDate.parse("2002-03-02"));
        student s8 = new student(8, "Hoang2", "Hond2", LocalDate.parse("2002-03-02"));
        students = themSinhVien(students, s7);
        students = themSinhVien(students, s8);
        System.out.println("Mảng sau khi thêm 2 sinh viên:");
        duyetMang(students);
        System.out.println("Sắp xếp theo theo id giảm dần");
        sapXepTheoID(students);
        duyetMang(students);
        System.out.println("In ra sinh viên nganh CNTT");
        inRaNganhCNTT(students);
    }

    static void duyetMang(student[] students) {
        for (int index = 0; index < students.length; index++) {
            System.out.println(students[index]);
        }
    }

    static void sapXepTheoChieuTangDanCuaTen(student[] students) {
        student studentTemp;
        for (int index = 0; index < students.length; index++) {
            for (int position = 0; position < students.length - index - 1; position++) {
                if (students[position].getName().compareTo(students[position + 1].getName()) > 1) {
                    studentTemp = students[position];
                    students[position] = students[position + 1];
                    students[position + 1] = studentTemp;


                }
            }
        }


    }

    static student[] themSinhVien(student[] students, student student) {
        student[] newStudent = new student[students.length + 1];
        for (int index = 0; index < students.length; index++) {
            newStudent[index] = students[index];
        }
        for (int index = 0; index < students.length; index++) {
            if (students[index].getId() != (student.getId())) {
                newStudent[newStudent.length - 1] = student;
            } else {
                System.out.println("Can not add!");
            }

        }
        return newStudent;

    }

    static void sapXepTheoID(student[] students) {
        student studentTemp;
        for (int index = 0; index < students.length; index++) {
            for (int position = 0; position < students.length - index - 1; position++) {
                if (students[position].getId() < students[position + 1].getId()) {
                    studentTemp = students[position];
                    students[position] = students[position + 1];
                    students[position + 1] = studentTemp;


                }
            }
        }

    }
    static void inRaNganhCNTT(student[] students){

        for (int index=0;index <students.length;index++)
        {
            if("CNTT".equals(students[index].getMajor())){
                System.out.println(students[index]);
            }

        }
    }
}
