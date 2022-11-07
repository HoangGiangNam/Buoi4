package BTbuoi4;

public class student {
     private int id;
     private String major;
     private String name;

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

    @Override
    public String toString() {
        return "BTbuoi4.student{" +
                "id=" + id +
                ", major='" + major + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

