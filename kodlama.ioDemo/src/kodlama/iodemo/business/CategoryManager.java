package kodlama.iodemo.business.concrete;

import java.lang.System.Logger;
import java.util.List;
import java.util.logging.Level;
import kodlama.iodemo.business.CategoryService;
import kodlama.iodemo.dataAccess.abstractDao.CategoryDao;
import kodlama.iodemo.dataAccess.concreteDao.hibernate.HibernateCategoryDao;
import kodlama.iodemo.entities.Category;

public class CategoryManager implements CategoryService{
    // business rules
    private CategoryDao categoryDao = null;
    private List<Category> categories = null;
    private List<Logger> loggers = null;
    
    public CategoryManager(CategoryDao categoryDao, List<Category> categories, List<Logger> loggers) {
        this.categoryDao = categoryDao;
        this.categories = categories;
        this.loggers = loggers;
    }

    public CategoryManager(HibernateCategoryDao hibernateCategoryDao, List<Category> categories) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void add(Category category){
        for (Category c : categories) {
            if (category.getCategoryName().equals(c.getCategoryName())) {
                try {
                    throw new Exception("More than one category with the same name cannot be added.");
                } catch (Exception ex) {
                    java.util.logging.Logger.getLogger(CategoryManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        categoryDao.add(category);
        categories.add(category);

    }
}
