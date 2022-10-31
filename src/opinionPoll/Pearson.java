package opinionPoll;

public class Pearson {
    //1. трябва да опишем нашите полета -> характеристики -> име и възраст
    private String name;
    private int age;

    //2. Кондтруктор -> създаваме обекти от ккласа
    public Pearson(String name, int age){
        // нове обект
        this.name = name;
        this.age = age;
    }

    //getter -> е маетод, чрез който достъпваме стойност на поле.
    //3. методи -> поведение.

    public String grtName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}
