package tj.sse.playItems.Route.iterator;
/*
 * @Description //路线
 **/
public interface Route {
    /*
     * @Description //路线
     * @return 是否有下一个景点
     **/
    public boolean hasNext();
    /*
     * @Description //
     * @return 下一个景点
     **/
    public Object next();

    public int getIndex();
}
