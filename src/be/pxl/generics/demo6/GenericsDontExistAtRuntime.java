package be.pxl.generics.demo6;

import be.pxl.generics.demo2.Animal;
import be.pxl.generics.demo2.Cat;
import be.pxl.generics.demo2.Fish;
import be.pxl.generics.demo2.Habitat;

public class GenericsDontExistAtRuntime {
    public static void main(String[] args) {
        System.out.println(test("abc"));
        System.out.println(test(123456L));
        System.out.println(test(new Integer(15)));
        System.out.println(doSomething("abc"));

        Habitat<Cat> catHabitat = new Habitat<>();
        Habitat<Fish> fishHabitat = new Habitat<>();
        System.out.println(catHabitat.getClass() == fishHabitat.getClass());

        //System.out.println(catHabitat instanceof Habitat<Cat>);
    }

    public static String doSomething(String s) {
        return "string";
    }

    public static String doSomething(Object o) {
        return "object";
    }

    public static <T> String test(T o) {
        return doSomething(o);
    }
}
