public class Classroom extends Person
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
        return teacher.getSubject;
    }
    public double classAverage()
    {
        double x = 0;
        for (Student cur : students)
        {
            x += getGPA(cur);
        }
        x =  x/students.length;
    }
    public printClass()
    {
        System.out.println(teacher);
        System.out.println(getSubject());
        for (Student everyone : students) // That is the array then any variable which is checked against the value of the array
        // in this case students.
        {
            System.out.println(students);
        }
    }

}
