public class Students
{
    //Variables
    String name;
    String gpa;
    String email;

    //Empty Constructor
    Students()
    {
        this.name = "";
        this.gpa = "";
        this.email = "";
    }

    //Complete Constructor
    Students(String name, String gpa, String email)
    {
        this.name = name;
        this.gpa = gpa;
        this.email = email;
    }

    //Getters
    public String getName()
    {
        return name;
    }

    public String getGpa()
    {
        return gpa;
    }

    public String getEmail()
    {
        return email;
    }
}

