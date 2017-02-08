package StudentAssignmentDistributionTest;

import course.Student;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by tkanchanawanchai6403 on 2/8/2017.
 */
class StudentTest {
    @org.junit.jupiter.api.Test
    void getEmail() {

    }

    @org.junit.jupiter.api.Test
    void setEmail() {

    }

    @org.junit.jupiter.api.Test
    void getName() {

    }

    @org.junit.jupiter.api.Test
    void setName() {
        Student student1 = new Student("John","john@gmail.com");
        Student student2 = new Student("Andrew", "andrew@gmail.com");
        System.out.println(student1);
        System.out.println(student2);
        student1.setName("Christy");
        System.out.println(student1);
        System.out.println(student2);

    }

}