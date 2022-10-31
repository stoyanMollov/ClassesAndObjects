package articles_02;

public class Article {
    // полета -> храктеристики.

    private  String title; // заглавие на всяка статия.
    private String content; // съдържанието.
    private String author; // автора

    // конструктор създава нови обекти
    // alt + insert

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    // методи -> поведение

    public void edit(String newContent){
        this.content = newContent;
    }
    public void changeAuthor(String newAuthor){
        this.author = newAuthor;
    }
    public void rename(String newTime){
        this.title = newTime;
    }
}
