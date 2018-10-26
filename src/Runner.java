public class Runner
{

    static String firstNames[] = { "Scrooge ", "Ben ", "Bob ", "Alex ", "Harold "};
    static String familyNames[] = {"Mcduck", "Mcdonald", "Smith", "Buttons", "Firefly"};

    public static void main (String [] args)
    {
        String [] randomNames = new String [firstNames.length];
        for(int i = 0; i < firstNames.length; i++)
        {
            double x = Math.random();
            int num = (int)(x * 5);
            randomNames[i] = firstNames[num] + familyNames[num];
        }
        Student [] students = new Student [firstNames.length];
        for(int i = 0; i < firstNames.length; i++)
        {
            students[i] = randomNames[i];
        }
        Teacher teacher= new Teacher ("APCSP", "Levin", "Mr");
        Classroom classroom = new Classroom (teacher , "APCSP", students);
        System.out.println(classroom);

    }

}
