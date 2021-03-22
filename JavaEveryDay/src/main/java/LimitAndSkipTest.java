import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @program: codinglfq.github.io
 * @description: Stream流，取用前几个：limit、跳过前几个：skip
 * @author: LFQ
 * @create: 2021-03-18 11:35
 *
 * 已知ArrayList集合中有如下元素{陈玄风、梅超风、陆乘风、曲灵风、武眠风、冯默风、罗玉风}，使用Stream
 * 1、取出前2个元素并在控制台打印输出。
 * 2、取出后2个元素并在控制台打印输出。
 */
@Slf4j
public class LimitAndSkipTest {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("陈玄风");
        list.add("梅超风");
        list.add("陆乘风");
        list.add("曲灵风");
        list.add("武眠风");
        list.add("冯默风");
        list.add("武眠风");
        list.add("罗玉风");

        list.stream().limit(2).forEach(System.out::println);
        log.info("------");
        log.info("list:" + list);
        list.stream().skip(list.size() - 2).forEach(System.out::println);

        HashMap<String, String> map = new HashMap<>();
        map.put("name1", list.get(0));
        map.put("name2", list.get(1));
        map.put("name3", list.get(2));
        log.info("map:" + map);  //map:{name3=陆乘风, name2=梅超风, name1=陈玄风}


    }
}
