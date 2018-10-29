public class Student extends Person
{
    private String firstName;
    private String familyName;
    private double GPA;
    private double osis;
    private double gradeLevel;
    public Student(String firstName, String familyName, double GPA, double osis, double gradeLevel)
    {
        super(firstName, familyName);
        this.firstName = firstName;
        this.familyName = familyName;
        this.GPA = GPA;
        this.osis = osis;
        this.gradeLevel = gradeLevel;
    }

    public double getGPA()
    {
        return GPA;
    }

    public double getOsis()
    {
        return osis;
    }

    public double getGradeLevel()
    {
        return gradeLevel;
    }
    public String toString()
    {
        return (firstName + ", " + familyName);
    }
}
//