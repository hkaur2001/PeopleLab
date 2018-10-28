public class Runner
{

    static String firstNames[] = { "Alice", "Bob", "Charlie", "David", "Emily", "Fredrick", "Gregory", "Hannah", "Isabel", "Jack", "Kathrine", "Lukas", "Maya", "Nelson", "Oscar", "Patricia", "Quincy", "Robert", "Stacy", "Tyler", "Ursula", "Veronica", "William", "Xavier", "Yolanda", "Zack" };
    // list of first names
    static String familyNames[] = {"Adams", "Brown", "Cooper", "Davis", "Evans", "Foster", "Garcia", "Harris", "Irons", "Jones", "Kirk", "Lewis", "Miller", "Norton", "O connor", "Peterson", "Quinn", "Rodriguez", "Smith", "Taylor", "Underwood", "Vargas", "Wilson", "Xi", "Yam", "Zip" };
    // list of family names
    static int gradeLevel;
    public static void main (String [] args)
    {
        int classSize = 20;
        gradeLevel = (int)(Math.random()*(12)+1);
        String [] randomFirstNames = new String [firstNames.length];
        String [] randomFamilyNames = new String [familyNames.length];
        // creates an array of random students names
        Student [] students = new Student [classSize];
        for (int i = 0; i < classSize; i++)
        {
            students [i] = randomStudent();
        }
        Teacher teacher= new Teacher ("APCSP", "Levin", "Mr");
        Classroom classroom = new Classroom (teacher, students);
        classroom.printClass();
        System.out.println(classroom.classAverage());

    }
    public static Student randomStudent()
    {
        return new Student(firstNames[(int)(Math.random()*(26))],familyNames[(int)(Math.random()*(26))], Math.random()*4,(int)(Math.random()*1000000000)+1, gradeLevel);
    }

}
