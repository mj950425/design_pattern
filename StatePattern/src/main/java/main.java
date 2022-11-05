package document;

public class main {
    public static void main(String[] args) {
        Draft draft = new Draft();
        Document document = new Document(draft);

        document.publish();
        document.publish();
        document.publish();
    }
}
