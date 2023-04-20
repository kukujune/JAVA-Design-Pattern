import java.util.ArrayList;

public class SimpleDisplayArticle extends DisplayArticleTemplate{
    public SimpleDisplayArticle(Article article) {
        super(article);
    }

    @Override
    protected void title() {
        System.out.println(article.getTitle());
    }

    @Override
    protected void content() {
        ArrayList<String> content = article.getContent();
        for(String now : content){
            System.out.println(now);
        }
    }

    @Override
    protected void footer() {
        System.out.println(article.getFooter());
    }
}
