package Excercise_1;

public class Student {
    public int matriculationNumber;
    public String names;

    public Student(){
        matriculationNumber = 0;
        names = "";
    }

    public Student(int matriculationNumber, String names) {
        this.matriculationNumber = matriculationNumber;
        this.names = names;
    }
    public int getMatriculationNumber(){
        return matriculationNumber;
    }
    @Override
    public String toString(){
        return matriculationNumber + " " + names;
    }
    public String getNames(){
        return names;
    }
}
