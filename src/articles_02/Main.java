package articles_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String articleData = scanner.nextLine();
        String[] articleParts = articleData.split(", ");
        String title = articleParts[0];
        String content = articleParts[1];
        String author = articleParts[2];

        Article article = new Article(title,content,author);

        int n = Integer.parseInt(scanner.nextLine()); // бория на командите

        for (int commandsCount = 1; commandsCount <= n; commandsCount++){
            //Прочитане на командите
            String commands = scanner.nextLine();
            // "Edit"
            // "Rename"
            // "Change Author"

            if (commands.contains("Edit")){
                // променяме съдържанието с новото.
                String newContent = commands.split(": ")[1];
                article.edit(newContent);
                
            } else if (commands.contains("Rename")) {
                String newTitle = commands.split(": ")[1];
                article.rename(newTitle);
                
            } else if (commands.contains("ChangeAuthor")) {
                String newAuthor = commands.split(": ")[1];
                article.changeAuthor(newAuthor);
            }
        }

        // заглавие - съдържание: автор
        System.out.println(article);
    }
}
