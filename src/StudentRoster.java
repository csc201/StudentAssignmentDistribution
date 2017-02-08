import course.Student;

public class StudentRoster
{
    private int size = 5;
    private Student[] list;
    private int count=0;

    public StudentRoster() {
        list = new Student[size];
    }

    public StudentRoster(int size) {
        this.size = size;
        list = new Student[size];
    }

    public void addStudent(Student student) {
        if(count>size) {
            enlarge();
        }
        list[count] = student;
        count++;
    }

    private void enlarge() {
        Student [] newList = new Student [list.length*2];
        for(int i=0; i<list.length; i++ ) {
            newList[i] = list[i];
        }
        list = newList;
    }

    public Student[] getStudentRoster()
    {
        return list;
    }

    public int getCount() {
        return count;
    }
}
