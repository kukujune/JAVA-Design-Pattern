import java.util.ArrayList;

public class MainEntry {
    public static void main(String[] args) {
        String title = "디자인 패턴";
        ArrayList<String> content = new ArrayList<>();
        content.add("You can dance, you can jive, having the time of your life");
        content.add("See that girl, watch that scene, dig in the Dancing Queen");
        content.add("Friday night and the lights are low");

        String footer = "2023.04.20";

        Article article = new Article(title, content, footer);

        System.out.println("Simple Display");
        DisplayArticleTemplate style1 = new SimpleDisplayArticle(article);
        style1.display();

        System.out.println();
        System.out.println("Caption Display");
        CaptionDisplayArticle style2 = new CaptionDisplayArticle(article);
        style2.display();

    }
}
