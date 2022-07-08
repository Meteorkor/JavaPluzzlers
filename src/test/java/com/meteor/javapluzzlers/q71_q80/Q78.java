package com.meteor.javapluzzlers.q71_q80;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class Q78 {

    @Test
    void wrong() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Set<String> s = new HashSet<>();
        s.add("foo");
        Iterator it = s.iterator();
        Method m = it.getClass().getMethod(
                "hasNext");//class com.meteor.javapluzzlers.q71_q80.Q78 cannot access a member of class java.util.HashMap$HashIterator (in module java.base) with modifiers "public final"
        //public final
        System.out.println(m.invoke(it));
        //다른 패키지에 있는 public 이 아닌 멤버에는 합법적으로 접근 할 수 없다.
    }

    @Test
    void answer() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Set<String> s = new HashSet<>();
        s.add("foo");
        Iterator it = s.iterator();
        Method m = it.getClass().getMethod("hasNext");
        //public final
        m.setAccessible(true);
        System.out.println(m.invoke(it));
    }

}
