package course;

public class Student {
    private String name;
    private String email;

    public Student() {
        name = "John";
        email = "NULL";
    }

    public Student(String email) {
        this.email = email;
    }

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                "email='" + email + '\'' +
                '}';
    }
}


