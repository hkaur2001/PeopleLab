public class Classroom
{
    private Student[] students;
    private Teacher teacher;

    public Classroom (Teacher teacher, Student[] students)
    {
        this.teacher = teacher; // They have to match as they're initializing that value for that variable.
        this.students = students;
    }
    public String getSubject()
    {
        return teacher.getSubject();
    }
    public double classAverage()
    {
        double x = 0;
        for (Student cur : students)
        {
            x += cur.getGPA();
        }
        x =  x/students.length;
        return x;
    }
    public void printClass()
    {
        System.out.println(teacher);
        System.out.println(getSubject());
        for (int i = 0; i < students.length; i++)
        {
            System.out.println(students[i]);
        }
    }

}
//