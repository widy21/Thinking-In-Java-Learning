package generics;

import generics.coffee.Coffee;
import generics.coffee.CoffeeGenerator;

import java.util.ArrayList;
import java.util.Collection;
import generics.coffee.*;
import java.util.*;
import net.mindview.util.*;
/**
 * @version 1.0
 * @Description: 泛型生成器
 * @author: hxw
 * @date: 2018/10/5 12:45
 */
public class Generators {

    /**
     *
     * @param coll 容器
     * @param gen 对象的生成器
     * @param n 对象数量
     * @param <T>
     * @return
     */
    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
        for(int i = 0; i < n; i++)
            coll.add(gen.next());
        return coll;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffee = fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
        for(Coffee c : coffee)
            System.out.println(c);
        Collection<Integer> fnumbers = fill(new ArrayList<Integer>(), new Fibonacci(), 12);
        for(int i : fnumbers)
            System.out.print(i + ", ");
    }
}
