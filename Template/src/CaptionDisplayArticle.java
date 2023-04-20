import java.util.ArrayList;

public class CaptionDisplayArticle extends DisplayArticleTemplate{
    public CaptionDisplayArticle(Article article) {
        super(article);
    }

    @Override
    protected void title() {
        System.out.println("Title: " + article.getTitle());
    }

    @Override
    protected void content() {
        ArrayList<String> content = article.getContent();
        for(String now : content){
            System.out.println("    " + now);
        }
    }

    @Override
    protected void footer() {
        System.out.println("Footer: " + article.getFooter());
    }
}
