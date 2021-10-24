package tj.sse.souvenir.abstractfactory;

class SouvenirFactory extends AbstractFactory{
    @Override
    public ISouvenir getSouvenir(String souvenir){
        if(souvenir == null){
            return null;
        }
        if(souvenir.equalsIgnoreCase("DOLL")){
            return new Doll();
        } else if(souvenir.equalsIgnoreCase("KEY BUCKLE")){
            return new KeyBuckle();
        }
        return null;
    }

    @Override
    public MovieIP getMovieIP(String movie) {
        return null;
    }
}
