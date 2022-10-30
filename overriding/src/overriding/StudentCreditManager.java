package overriding;
public class StudentCreditManager extends BaseCreditManager{
    // basedeki calculator u eziyoruz yani üstüne yazıyoruz
    @Override
    public double calculator(double amount){
        return amount * 1.05;
    }
}
