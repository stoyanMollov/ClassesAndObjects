package opinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Pearson> pearsonList = new ArrayList<>();

        int n  = Integer.parseInt(scanner.nextLine());// бр. редове с лична информация

        for (int row = 1; row <= n; row++) {
            String data = scanner.nextLine(); // "Desi 24"
            // "{име} {възраст}". split(" ") -> ["{име}", "{възраст}"]
            String name = data.split(" ")[0];
            int age = Integer.parseInt(data.split(" ")[1]);

            if(age > 30){
                // Създавам запис за човека -> съхраняване запис
                Pearson pearson = new Pearson(name,age);
                pearsonList.add(pearson);
            }
        }

        for (Pearson pearson:pearsonList) {
            // name - age
            System.out.println(pearson.grtName() + " - " + pearson.getAge());
        }
    }
}
