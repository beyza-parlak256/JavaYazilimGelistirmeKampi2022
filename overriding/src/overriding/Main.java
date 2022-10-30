package overriding;
public class Main {
    public static void main(String[] args) {
        
        BaseCreditManager[] creditManagers = new  BaseCreditManager[]{new TeacherCreditManage(),new FarmCreditManager(), new StudentCreditManager()};
    
        for(BaseCreditManager creditManager: creditManagers){
            System.out.println(creditManager.calculator(1000));
        }
    }
    
}
