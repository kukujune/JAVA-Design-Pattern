public class CaptionDisplay implements Display{
    @Override
    public void title(Draft draft) {
        System.out.println("Title: " + draft.getTitle());
    }

    @Override
    public void author(Draft draft) {
        System.out.println("Author: " + draft.getAuthor());
    }

    @Override
    public void content(Draft draft) {
        var content = draft.getContent();
        for(int i=0; i<content.length; i++){
            System.out.println(content[i]);
        }
    }
}
