package Day15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

/*
 * 每个月的第三周的周六可以进行交易。其他时间不交易。用户输入一个日期字符串，给用户提醒：
 *   交易正在进行，交易已结束，交易还未开始。
 * */
public class DateTest {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入日期： ");
        Scanner sc = new Scanner(System.in);
        String arr = sc.nextLine();

        //字符串转换日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date date = sdf.parse(arr);
        //设置日历的时间为用户输入的时间
        Calendar c = Calendar.getInstance();
        c.setTime(date);

        //获取周几
        int dayOfWeek = c.get(Calendar.DAY_OF_MONTH);
        //获取第几周
        int week = c.get(Calendar.WEEK_OF_MONTH);

        //正在进行
        if (week == 3 && dayOfWeek == 7) {
            System.out.println("交易正在进行");
        } else if (week < 3 || week == 3 && dayOfWeek < 7){
            //还未开始
            System.out.println("交易还未开始");
        }else {
            //已经结束
            System.out.println("交易已经结束");
        }
    }
}
