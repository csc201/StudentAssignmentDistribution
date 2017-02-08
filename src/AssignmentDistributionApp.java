import course.Question;
import course.Student;

import java.util.Scanner;

public class AssignmentDistributionApp
{
    public static void main(String[] args)
    {
        StudentRoster studentRoster = new StudentRoster();

        Student student1 = new Student("GeorgeWashington@gmail.com");
        studentRoster.addStudent(student1);
        Student student2 = new Student("JohnAdams@gmail.com");
        studentRoster.addStudent(student2);
        Student student3 = new Student("ThomasJefferson@gmail.com");
        studentRoster.addStudent(student3);
        Student student4 = new Student("JamesMadison@gmail.com");
        studentRoster.addStudent(student4);
        Student student5 = new Student("DonaldTrump@gmail.com");
        studentRoster.addStudent(student5);
        Student[] roster = studentRoster.getStudentRoster();


        StudentQuestions studentQuestions = new StudentQuestions();
        Question [] theQuestions =  new Question [5];
        theQuestions[0] = new Question("Example Question One", "one", 1.0);
        theQuestions[1] = new Question("Example Question Two", "Two", 1.0);
        theQuestions[2] = new Question("Example Question Three", "Three", 1.0);
        theQuestions[3] = new Question("Example Question Four", "Four", 1.0);
        theQuestions[4] = new Question("Example Question Five", "Five", 1.0);

        studentQuestions.addQuestion(theQuestions);
        Question[] assignments = studentQuestions.getStudentQuestions();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter this weeks chapter number:");
        int chapter = input.nextInt();

        Question question = studentQuestions.getQusetion();
        String mailSmtpHost = "localhost";


        for (int i=0; i < roster.length; i++)
        {
            String mailTo = roster[i].getEmail();
            String mailFrom = "Professor@gmail.com";
            String mailSubject = "This Week's Assignment";
            String mailText = "Here is your problem this week: "+ "Chapter "+ chapter+ " " + question;

            SendEmailMethod.sendEmail(mailTo, mailFrom, mailSubject, mailText, mailSmtpHost);
        }

    }


}
