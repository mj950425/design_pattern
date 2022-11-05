import document.State;

public class Published implements State {
    private Document document;
    @Override
    public void publish() {
        System.out.print("Published !");
    }
    @Override
    public void setDocument(Document document) {
        this.document = document;
    }
}
