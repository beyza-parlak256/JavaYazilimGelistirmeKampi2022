package canliyayinoop;
public class TeacherCreditManager implements ICreditManager{

    @Override
    public void Calculate() {
        // hesaplamalar
        System.out.println("Ogretmen kredisi hesapland─▒"); 
    }

    @Override
    public void Save() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
