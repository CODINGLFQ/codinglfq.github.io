import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @program: codinglfq.github.io
 * @description: 日期
 * @author: lfq
 * @create: 2021-01-18 17:41
 */
public class TestDate {
    public static void main(String[] args) {
//        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");
        Calendar c = Calendar.getInstance();
        System.out.println("现在日期:"+c);

//        System.out("当前日期:"+sf.format(c.getTime()));
        c.add(Calendar.DAY_OF_MONTH, 1);
        System.out.println("增加n天后日期:"+sf.format(c.getTime()));
    }
}
