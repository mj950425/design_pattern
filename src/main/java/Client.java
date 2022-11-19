public class Client {
    public static void main(String[] args) {
        Forest forest = new Forest();
        forest.plantTree(1, 2, "소나무", "초록색", "짙게");
        forest.draw(new Canvas());
    }
}
