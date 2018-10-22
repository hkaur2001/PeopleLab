public class Student extends Person
{
    private String firstName;
    private String familyName;
    public Student(String firstName, String familyName)
    {
        super(firstName, familyName);
        this.firstName = firstName;
    }
    public double getGpa()
    {
        return (5);
    }

}
