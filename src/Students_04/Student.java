package Students_04;

public class Student {
    // полета -> характеристики -> име, фамилия, оценка
    private String name;
    private String lastName;
    private double grade;

    //конструктор -> създаваме обекти от класа.
    public Student(String name, String lastName, double grade){
        this.name = name;
        this.lastName = lastName;
        this.grade = grade;
    }
}
