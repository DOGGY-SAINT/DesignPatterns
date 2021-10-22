package tj.sse.playItems.Route.iterator;

import tj.sse.playItems.Route.strategy.routePlanning;
import tj.sse.playItems.Route.strategy.strategyA;
//import tj.sse.playItems.Route.strategy.;
import tj.sse.playItems.State.QuidditchGame;
import tj.sse.playItems.Observer.PotionsClass;
import tj.sse.playItems.ResChain.WandGame;
import tj.sse.playItems.Template.templatemethod;

/**
 * @ClassNameSpotsName
 * @Description TODO
 * @Author86182
 * @Date2021/10/1515:51
 * @Version 1.0
 **/

public class SpotsName implements Spots {
    strategyA route=new strategyA();

    public String[] names =route.provideSuggestions();

    @Override
    public tj.sse.playItems.Route.iterator.Route getRoute() {
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
