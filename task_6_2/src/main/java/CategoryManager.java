import java.util.List;

interface CategoryManager {
    Category getCategory(String id);

    void removeCategory(String id);

    void addCategory(Category category);

    List<Category> getCategories();
}
