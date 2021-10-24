package tj.sse.souvenir.abstractfactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SOUVENIR")){
            return new SouvenirFactory();
        } else if(choice.equalsIgnoreCase("MOVIE")){
            return new MovieIPFactory();
        }
        return null;
    }
}
