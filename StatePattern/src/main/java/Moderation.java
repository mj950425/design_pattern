public class Moderation implements State {
    private Document document;

    public Moderation() {
    }
    @Override
    public void publish() {
        System.out.println("Moderation !");
        Published published = new Published();
        document.changeState(published);
        published.setDocument(document);
    }
    @Override
    public void setDocument(Document document) {
        this.document = document;
    }
}
