package pkginterface;

public class Main {

    public static void main(String[] args) {
        // interfaceler referans tutucudur
        // interfaceler newlenemezler
        // bağımlılıkları önlemek için katmanlar arası geçişleri interfaceler ile yaparız
        ICustomerDal customerDal = new OracleCustomerDal();
        customerDal.Add();
        ICustomerDal customerDal1 = new MySqlCustomerDal();
        customerDal1.Add();

    }

}
