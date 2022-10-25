package oopwithnlayeredapp;

import oopwithnlayeredapp.business.ProductManager;
import oopwithnlayeredapp.core.logging.DatabaseLogger;
import oopwithnlayeredapp.core.logging.FileLogger;
import oopwithnlayeredapp.core.logging.Logger;
import oopwithnlayeredapp.dataAccess.JdbcProductDao;
import oopwithnlayeredapp.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product = new Product(1,"Redmi Note 12",12500);
        
        Logger[] loggers = {new DatabaseLogger(), new FileLogger()};
        ProductManager productManager = new ProductManager(new JdbcProductDao(),loggers);
        productManager.add(product);
    }
    
}
