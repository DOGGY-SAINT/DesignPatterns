package tj.sse.souvenir.abstractfactory;

class MovieIPFactory extends AbstractFactory{
    @Override
    public ISouvenir getSouvenir(String souvenir){
        return null;
    }

    @Override
    public MovieIP getMovieIP(String type) {
        if(type == null){
            return null;
        }
        if(type.equalsIgnoreCase("MINIONS")){
            return new Minions();
        } else if(type.equalsIgnoreCase("PANDA")){
            return new KungFuPanda();
        }
        return null;
    }
}
