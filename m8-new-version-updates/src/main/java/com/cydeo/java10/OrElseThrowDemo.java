package com.cydeo.java10;

import java.util.Optional;

public class OrElseThrowDemo {
    public static void main(String[] args) {
        Optional<String> str = Optional.empty();

        //System.out.println(str.get());// when we only use get(), give ugly exception (.NoSuchElementException)
        //your application is gonna stop, we don't want this.

//        if(str.isPresent()){
//            System.out.println(str.get());
//        }else {
//            //exception handling
//        }

        // but wright now Java 10 combining get() and isPresent(), we can directly orEseThrow()
        //str.orEseThrow()==> If a value is present, returns the value, otherwise throws NoSuchElementException.

        System.out.println(str.orElseThrow());
        System.out.println(str.orElseThrow(RuntimeException::new));
    }
}
