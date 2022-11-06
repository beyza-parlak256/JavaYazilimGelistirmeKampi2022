package kodlama.iodemo.dataAccess.concreteDao.hibernate;

import kodlama.iodemo.dataAccess.abstractDao.CategoryDao;
import kodlama.iodemo.entities.Category;

public class HibernateCategoryDao implements CategoryDao{

    @Override
    public void add(Category category) {
        System.out.println(category.getCategoryName() + " added to category database with Hibernate");
    }
    
}
