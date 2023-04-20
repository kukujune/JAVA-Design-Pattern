public class Publication extends Draft {
    // 새로운 요구사항이 생겨 새로운 기능을 추가한다.
    // 새로운 기능은 출판사와 가격정보를 보여준다.
    // 단, 기존 기능은 건들면 안된다.

    private String publisher;
    private int cost;

    public Publication(String title, String author, String[] content, String publisher, int cost){
        super(title, author, content);
        this.publisher = publisher;
        this.cost = cost;
    }

    public void printPublicationInfo(){
        System.out.println("#" + publisher + " $" + cost);
    }

    public void print(Display display){
        super.print(display);
        printPublicationInfo();
    }

}
