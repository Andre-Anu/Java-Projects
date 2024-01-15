/**
 * Assignment 4 Challenge 1
 * André Martins
 * 05/06/2023
 * 17:00
*/

public class StudentRecord
{
    private String firstname;
    private String lastname;
    private String studentid;
    private int grade;

    // Constructors
    
    public StudentRecord()
    {
        firstname = "";
        lastname = "";
        studentid = "";
        grade = 0;
    }

    public StudentRecord(String firstname, String lastname, String studentid, int grade)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.studentid = studentid;
        this.grade = grade;
    }

    // Getters and Setters

    public void setfirstname(String firstname) 
    {
        this.firstname = firstname;
    }

    public String getfirstname() 
    {
        return firstname;
    }

    public void setlastname(String lastname) 
    {
        this.lastname = lastname;
    }

    public String getlastname() 
    {
        return lastname;
    }

    public void setstudentid(String studentid) 
    {
        this.studentid = studentid;
    }

    public String getstudentid()
    {
        return studentid;
    }

    public void setgrade(int grade)
    {
        this.grade = grade;
    }

    public int getgrade()
    {
        return grade;
    }

    // Methods

    public String getlettergrade()
    {
        if (grade >= 90 && grade <= 100) {
            return "A";
        } else if (grade >= 80 && grade <= 89) {
            return "B";
        } else if (grade >= 70 && grade <= 79) {
            return "C";
        } else if (grade >= 60 && grade <= 69) {
            return "D";
        } else if (grade >= 50 && grade <= 59) {
            return "E";
        } else {
            return "F";
        }
    }
    
    public int getvowelcount() 
    {
        int number = 0;
        for (int i = 0; i < firstname.length(); i++)
        {
            char ch = firstname.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                number++;
            }
        }
        return number;
    }
}