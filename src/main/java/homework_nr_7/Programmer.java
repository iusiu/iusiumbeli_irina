package homework_nr_7;

public class Programmer extends Employee{
    String programmingLanguage;
    int yearsOfExperience;
    public Programmer(String name, String surname, String companyName, String programmingLanguage, int yearsOfExperience){
        super(name, surname, companyName );
        this.programmingLanguage = programmingLanguage;
        this.yearsOfExperience = yearsOfExperience;
    }
    @Override
    public void work(){
        System.out.println("The programmer is working in language " + programmingLanguage + " " + yearsOfExperience + " years" + " in company " + companyName);

    }

}
