package model;

public class Student {
     private String name;
     private  String sge;

    public Student() {
    }

    public Student(String name, String sge) {
        this.name = name;
        this.sge = sge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSge() {
        return sge;
    }

    public void setSge(String sge) {
        this.sge = sge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sge='" + sge + '\'' +
                '}';
    }
}
