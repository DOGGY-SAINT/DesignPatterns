package tj.sse.souvenir.abstractfactory;

abstract public class AbstractFactory {
    public abstract MovieIP getMovieIP(String movie);
    public abstract ISouvenir getSouvenir(String souvenir) ;
}
