package entities;

public class Student {
    public String name;
    public double firstQuarter;
    public double secondQuarter;
    public double thirdQuarter;

    public double calculateFinalGrade(){
        return firstQuarter + secondQuarter + thirdQuarter;
    }

    public double calculateMissingPoints(){
        return 60 - calculateFinalGrade();
    }

    public String toString(){
        return "FINAL GRADE = " + String.format("%.2f", calculateFinalGrade());
    }
}
