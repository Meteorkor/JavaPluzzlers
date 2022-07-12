package com.meteor.javapluzzlers.q91_q95.q81_q90;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class Q91 {

    @Test
    void wrong() {
        Sub sub = new Sub(666);
        sub.checkInvariant();

        Sub copy = (Sub) deepCopy(sub);
        copy.checkInvariant();
//        invariant violated
//        java.lang.AssertionError: invariant violated
//        at com.meteor.javapluzzlers.q91_q95.q81_q90.Sub.checkInvariant(Q91.java:51)
//        at com.meteor.javapluzzlers.q91_q95.q81_q90.Q91.wrong(Q91.java:21)

        //id 즉 hashCode가 초기화 되기전에 Set에 넣게되어 버킷도 잘못 배정된다.

        //직렬화 한후 역직렬화하는 과정에서 올바르지 않은 복사본이 생성된다.
        //HasSetm HashTable, HashMap을 직렬화 하려면, 이들의 컨텐스가 자신을 직접/간접 으로 다시 참조하는 일이 없도록 하라.


    }

    static public Object deepCopy(Object obj) {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            new ObjectOutputStream(bos).writeObject(obj);
            ByteArrayInputStream bin = new ByteArrayInputStream(bos.toByteArray());
            return new ObjectInputStream(bin).readObject();
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

}

class Super implements Serializable {
    final Set<Super> set = new HashSet<>();
}

final class Sub extends Super {
    private int id;

    public Sub(int id) {
        this.id = id;
        set.add(this);
    }

    public void checkInvariant() {
        if (!set.contains(this)) {
            throw new AssertionError("invariant violated");
        }
    }

    public int hashCode() {
        return id;
    }

    public boolean equals(Object o) {
        return (o instanceof Sub) && (id == ((Sub) o).id);
    }

}