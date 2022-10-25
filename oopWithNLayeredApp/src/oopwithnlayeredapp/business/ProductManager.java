package oopwithnlayeredapp.business;
import java.util.List;
import oopwithnlayeredapp.core.logging.Logger;
import oopwithnlayeredapp.dataAccess.HibernateProductDao;
import oopwithnlayeredapp.dataAccess.JdbcProductDao;
import oopwithnlayeredapp.dataAccess.ProductDao;
import oopwithnlayeredapp.entities.Product;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;
    
    public ProductManager(ProductDao productDao, Logger[] loggers){
        this.productDao = productDao;
        this.loggers = loggers;
    }
    
    public void add(Product product) throws Exception{ 
        // iş kuralları = business rules
        if(product.getUnitPrice() < 100){
            // hata
            throw new Exception("Ürün fiyatı 100 den küçük olamaz !");
        }
        
        ProductDao hibernateProductDao = new HibernateProductDao();
        hibernateProductDao.add(product);
        
        for(Logger logger : loggers){ // [db,mail]
            logger.log(product.getName());
        }
    }
}
