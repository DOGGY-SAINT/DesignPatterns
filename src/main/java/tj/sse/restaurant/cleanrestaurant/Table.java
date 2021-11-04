package tj.sse.restaurant.cleanrestaurant;

/**
 * @Classname CleanItem
 * @Description 具体实现打扫餐厅
 * @Author Wang Haoting
 * @Date 2021/11/4 22:48
 * @Version 1.0
 **/
class Table implements ICleanable {//打扫餐桌

    public void cleaned() {
        System.out.println("餐桌被清理干净");
    }
}

