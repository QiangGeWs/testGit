import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2017/8/30.
 */
public class T {

    public static void main(String[] args){
        Map map = new HashMap<>(10);
        for(int i=0;i<10;i++){
            map.put(i, i);
        }
        System.out.println(map.size());
    }
}
class MyThread extends Thread {
    private volatile int num = 0;
    private int res;
    public void run() {
        for(int i=0;i<10;i++){
             res += num++;
        }
    }
    public int result(){
        return res;
    }
}