import document.State;

public class Draft implements State {
    private Document document;
    @Override
    public void publish() {
        System.out.print("Draft !");
        document.changeState(new Moderation());
    }
    @Override
    public void setDocument(Document document) {
        this.document = document;
    }
}
