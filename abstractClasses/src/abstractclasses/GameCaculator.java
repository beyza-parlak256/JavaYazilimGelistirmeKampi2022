package abstractclasses;
// Calculator() her extends edildiği yerde ayrı ayrı yazılmak zorunda
// abstract classlar asla newlenemez
public abstract class GameCaculator {
    public abstract void Calculator();
    
    // final ekleyince override edilemez, olduğu gibi kullanılmak zorunda 
    public final void GameOver(){
        System.out.println("Game Over !");
    }
}
