package com.example.design_pattern;

public class SingletonPattern {
}

class test{

}
class SingletonTest {
    private static  SingletonTest instance;
    //Private constructor to prevent instantiation of the class from other classes.
    private SingletonTest(){}

        public static SingletonTest getInstance () {
            if (instance==null){
            synchronized (SingletonTest.class) {
            if (instance == null) {
                instance = new SingletonTest();
            }
        }
    }
            return instance;
    }


}