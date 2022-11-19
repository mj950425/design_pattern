public class Published implements State {
    private Document document;

    public Published() {
    }

    @Override
    public void publish() {
        System.out.println("Published !");
    }
    @Override
    public void setDocument(Document document) {
        this.document = document;
    }
}
