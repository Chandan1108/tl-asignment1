package org.example;

import java.util.*;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;

import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        PracticeImpl practiceImpl = new PracticeImpl();
        Random randomNum = new Random();


        /*method1. return a random list of integers
        method2. return a map of Integer, String(random string)
        method3. Create and print odd numbers till 100
        Write a RXJava function which will call above functions as
        Call method3
        call method1
        call method2 & find all the values from method2 whose keys match integers from method1
        print the matching integers and strings
        This should be a single rxChain. Write at least 2 unit tests. Create separate java classes if need be(not mandatory).*/

        /*practiceImpl.method3()
                      .andThen(Observable.defer(() -> PracticeImpl.method1())
                      .flatMap(matchingInteger -> practiceImpl.method2()
                      .flatMap(map -> Observable.fromIterable(map.entrySet()))
                      .filter(entry -> entry.getKey().equals(matchingInteger))
                      .map(Map.Entry::getValue) // Map to values
                      .map(value -> "Matching Integer: " + matchingInteger + ", String: " + value)
        )).subscribe(
                System.out::println, // Print matching integers and strings
                Throwable::printStackTrace
        );*/


        practiceImpl.method3()
                    .andThen(practiceImpl.results())
                    .subscribe(System.out::println,Throwable::printStackTrace);













    }


}