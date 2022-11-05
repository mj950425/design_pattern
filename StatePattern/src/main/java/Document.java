import document.State;

public class Document {
    private State state;

    public Document(State state) {
        this.state = state;
        state.setDocument(this);
    }

    public void publish() {
        state.publish();
    }

    public void changeState(State state) {
        this.state = state;
    }
}
