package com.example.design_pattern;
;

import java.util.HashSet;
import java.util.Set;

public class ObjectPoolPatern {
    public static void main(String[] args) {
        StudentPool sp=new StudentPool();
        Student student1=sp.checkOut();
        Student student2=sp.checkOut();
        Student student3=sp.checkOut();

        sp.checkIn(student1);
        sp.checkIn(student2);

        Student student4=sp.checkOut();
        Student student5=sp.checkOut();
        Student student6=sp.checkOut();

   }

}


 abstract class ObjectPool<T> {

    private final Set<T> available = new HashSet<>();
    private final Set<T> inUse = new HashSet<>();

    protected abstract T create();

    public synchronized T checkOut() {
        if (available.isEmpty()) {
            available.add(create());
        }
        var instance = available.iterator().next();
        available.remove(instance);
        inUse.add(instance);
        System.out.println("available: "+available.size()+" inUse: "+inUse.size());
        return instance;
    }

    public synchronized void checkIn(T instance) {
        inUse.remove(instance);
        available.add(instance);
        System.out.println("available: "+available.size()+" inUse: "+inUse.size());

    }

    @Override
    public synchronized String toString() {
        return String.format("Pool available=%d inUse=%d", available.size(), inUse.size());
    }
}

class Student{
    private String name;
    private String family;
}

class StudentPool extends ObjectPool<Student>{

    @Override
    protected Student create() {
        return new Student();
    }
}