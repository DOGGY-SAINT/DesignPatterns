package tj.sse.souvenir.abstractfactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("doll")){
            return new DollFactory();
        } else if(choice.equalsIgnoreCase("keybuckle")){
            return new KeyBuckleFactory();
        }
        return null;
    }
}
