public class Tree {
    private int x;
    private int y;

    public Tree(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Tree(int x, int y, TreeType treeType) {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }
    private TreeType treeType;

    public void draw(Canvas canvas) {
        this.treeType.draw(canvas, x, y);
    }
}
