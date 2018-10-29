public class Teacher extends Person {
    private String Subject;
    private String familyName;
    private String Title;

    public Teacher(String Subject, String familyName, String Title) {
        super(Subject, familyName);
        this.Subject = Subject;
        this.familyName=familyName;
        this.Title= Title;
    }
    public String getSubject() {
        return (Subject);
    }
    public String familyName() {
        return (familyName);
    }
    public String Title(){
        return(Title);
    }
    public String toString(){
        return Title + ". " + familyName;
    }

}
//



