package BTbuoi4.Bai1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class student {
     private int id;
     private String major;
     private String name;
     private String birthDay;
     private LocalDate localDate;

    public student(int id, String major, String name, LocalDate birthDay) {
        this.id = id;
        this.major = major;
        this.name = name;
        this.birthDay = birthDay.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    public student(int id, String major, String name) {
        this.id = id;
        this.major = major;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
       String text="id=%d,major=%s,name=%s,birthday=%s";
       return String.format(text,this.id,this.major,this.name,this.birthDay);
    }
}

