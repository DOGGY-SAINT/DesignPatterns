package tj.sse.playItems.route.iterator;

import tj.sse.playItems.route.strategy.strategyA;

/**
 * @ClassNameSpotsName
 * @Description TODO
 * @Author86182
 * @Date2021/10/1515:51
 * @Version 1.0
 **/

public class SpotsName implements Spots {
//    引入策略模式的策略
    strategyA route=new strategyA();
    public String[] names = route.provideSuggestions();

    @Override
    public Route getRoute() {
        return new SpotsRoute();
    }

//    Route抽象迭代器的具体实现
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
