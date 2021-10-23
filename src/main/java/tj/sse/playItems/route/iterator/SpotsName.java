package tj.sse.playItems.Route.iterator;

import tj.sse.playItems.Route.strategy.strategyA;

/**
 * @ClassNameSpotsName
 * @Description TODO
 * @Author86182
 * @Date2021/10/1515:51
 * @Version 1.0
 **/

public class SpotsName implements Spots {
    strategyA route=new strategyA();
    public String[] names = route.provideSuggestions();

    @Override
    public Route getRoute() {
        return new SpotsRoute();
    }

    private class SpotsRoute implements Route {
        int index;

        @Override
        public boolean hasNext(){
            if(index< names.length)
                return true;
            return false;
        }

        @Override
        public Object next(){
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }

        @Override
        public int getIndex(){
            return index;
        }
    }

}
