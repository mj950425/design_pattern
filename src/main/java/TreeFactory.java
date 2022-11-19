import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class TreeFactory {
    private static List<TreeType> treeTypes = new ArrayList<>();
    public static TreeType getTreeType(String name, String color, String texture) {
        Optional<TreeType> type = treeTypes.stream()
                .filter(treeType -> Objects.equals(treeType.getName(), name)
                        && Objects.equals(treeType.getColor(), color)
                        && Objects.equals(treeType.getTexture(), texture)).findFirst();
        if (type.isEmpty()) {
            TreeType newType = new TreeType(name, color, texture);
            treeTypes.add(newType);
            return newType;
        }
        return type.get();
    }
}
