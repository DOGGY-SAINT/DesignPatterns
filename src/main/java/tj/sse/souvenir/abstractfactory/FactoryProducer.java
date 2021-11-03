package tj.sse.souvenir.abstractfactory;

//选择哪个具体工厂进行生产
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
