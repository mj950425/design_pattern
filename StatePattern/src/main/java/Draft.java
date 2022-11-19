public class Draft implements State {
    private Document document;

    public Draft() {
    }

    @Override
    public void publish() {
        System.out.println("Draft !");
        Moderation moderation = new Moderation();
        document.changeState(moderation);
        moderation.setDocument(document);
    }
    @Override
    public void setDocument(Document document) {
        this.document = document;
    }
}
