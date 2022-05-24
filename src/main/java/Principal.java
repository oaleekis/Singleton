
public class Principal {
    public static void main(String[] args) {
        
        //Construtor ilegal
        //SingleObject object = new SingleObject();
        
        //Recupera um objeto
        SingleObject object1 = SingleObject.getInstance();
        object1.showMessage();
        
        SingleObject object2 = SingleObject.getInstance();
        object2.showMessage();
    }
    
}
