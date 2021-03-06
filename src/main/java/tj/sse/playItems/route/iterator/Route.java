package tj.sse.playItems.route.iterator;
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
    /*
     * @Description //
     * @return 序列号
     **/
    public int getIndex();
}
