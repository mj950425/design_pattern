import document.State;

public class Moderation implements State {
    private Document document;
    @Override
    public void publish() {
        System.out.print("Moderation !");
        document.changeState(new Published());
    }
    @Override
    public void setDocument(Document document) {
        this.document = document;
    }
}
