package pkginterface;
public class MySqlCustomerDal implements ICustomerDal,IRepository{
    // Dal veritabanı katmanı = veritabanı işlemlerini burada yaparız
    
    @Override
    public void Add() {
        System.out.println("My SQL eklendi");
    } 
    
}
