package tj.sse.snackshop.milktea;

/**
 * @Classname HalfSuger
 * @Description 甜度子类，桥接模式
 * @Author tianxi
 * @Date 2021-10-10 13:25
 * @Version 1.0
 **/
public class HalfSuger implements Sweetness {
    @Override
    public String getSweetness(){
        return "HalfSuger";
    }
}
