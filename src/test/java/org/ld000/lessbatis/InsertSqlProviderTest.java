package org.ld000.lessbatis;

import org.junit.Test;
import org.ld000.lessbatis.provider.InsertSqlProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lidong9144@163.com 17-3-8.
 */
public class InsertSqlProviderTest {

    private InsertSqlProvider<Obj> insertSqlProvider = new InsertSqlProvider<>();

    @Test
    public void test() {
        Obj obj = new Obj();
        obj.setId(123L);
        obj.setName("df");
        obj.setUserName("dfd");
        String sql = insertSqlProvider.insert(obj);

        System.out.println(sql);
    }

    @Test
    public void test1() {
        List<Obj> list = new ArrayList<>();

        Obj obj = new Obj();
        obj.setId(123L);
        obj.setName("df");
        obj.setUserName("dfd");

        Obj obj2 = new Obj();
        obj2.setId(156L);
        obj2.setName("dfxx");
        obj2.setUserName("dfcd");

        Obj obj3 = new Obj();
        obj3.setId(861L);
        obj3.setName("dfdf");
        obj3.setUserName("dfetrd");

        list.add(obj);
        list.add(obj3);
        list.add(obj2);

        Map<String, Object> map = new HashMap<>();
        map.put("list", list);
        String sql = insertSqlProvider.batchInsert(map);

        System.out.println(sql);
    }

}
