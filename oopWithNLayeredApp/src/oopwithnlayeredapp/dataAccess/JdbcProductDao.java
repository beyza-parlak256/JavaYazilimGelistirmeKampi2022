package oopwithnlayeredapp.dataAccess;
import oopwithnlayeredapp.entities.Product;

// Dao = Data Access Object
public class JdbcProductDao implements ProductDao{
    public void add(Product product){
        // sadece ve sadece DB erişim kodları buraya yazılır ... SQL
        System.out.println("JDBC ile veritabanına eklendi..");
    }
    
}
