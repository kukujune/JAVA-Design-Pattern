public class MainEntry {
    public static void main(String[] args) {
        var title = "너구리";
        var author = "너구리";
        String[] content = {
                "너구리는 무작정 달리고 있었다",
                "너무나도 빨리 달리고 있었기에 너구리의 귀는 바람에 펄럭였다",
                "한참을 달렸을까 너구리는 갑자기 멈춰섰다"
        };

        Draft draft = new Draft(title, author, content);
        Display display1 = new SimpleDisplay();
        draft.print(display1);
        System.out.println();

        Display display2 = new CaptionDisplay();
        draft.print(display2);
        System.out.println();

        var publisher = "목림출판";
        var cost = 100;

        Publication publication = new Publication(title, author, content, publisher, cost);
        publication.print(display1);
        System.out.println();

        publication.print(display2);

    }
}
