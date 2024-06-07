package org.example;
import java. util. HashMap;
import java.util.*;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Observable;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static io.reactivex.rxjava3.internal.jdk8.FlowableFlatMapStream.subscribe;

public class PracticeImpl {


   /* Create 3 separate rxJava functions:
    method1. return a random list of integers
    method2. return a map of Integer, String(random string)
    method3. Create and print odd numbers till 100
    Write a RXJava function which will call above functions as
    Call method3 // {1,3,5,7,9…..}
    call method1 // {1,5,9}
    call method2 & find all the values from method2 whose keys match integers from method1 ({1: string1}, {5:string2},{9: string3})
    print the matching integers and strings*/

    Random random1 = new Random();
    public Completable method3() {
        Completable completable = Completable.fromRunnable(() -> {
            System.out.println("First operation started");
            Observable.range(1,100).filter(i->i%2!=0).subscribe(System.out :: println);
            System.out.println("First operation completed");
        });

        return completable;
    }

   /* public Completable methodNew1() {
        //List<Integer> listnew= new ArrayList<Integer>();
        //listnew=randomNumber();
        Completable completable = Completable.fromRunnable(() -> {
            System.out.println("Second operation started");
            Observable.fromIterable(randomNumber()).subscribe(System.out :: println);
            System.out.println("Second operation completed");
        });
        //return Observable.fromIterable(randomNumber());
        return completable;
    }*/

    public Observable<Map<Integer, String>> method2() {
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        IntStream.range(1,100).forEach((j)->map.put(random1.nextInt(100),PracticeImpl.randomString()));
        return Observable.just(map);


    }
    public static String randomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return generatedString;

    }


    public static Observable<Integer>method1() {
        return Observable.fromIterable(randomNumber());

    }

    public static List<Integer> randomNumber() {
        Random random = new Random();
        return IntStream.rangeClosed(1, 100)
                .mapToObj(i -> random.nextInt(100))
                .collect(Collectors.toList());

    }



    public static List<String> randomStringList(int value) {
        List<String> strList = new ArrayList<String>();
        for(int i=1;i<=value;i++){
            int leftLimit = 97; // letter 'a'
            int rightLimit = 122; // letter 'z'
            int targetStringLength = 10;
            Random random = new Random();

            String generatedString = random.ints(leftLimit, rightLimit + 1)
                    .limit(targetStringLength)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();
            strList.add(generatedString);
        }
        return strList;



    }


    public Observable<String> results(){
        PracticeImpl practiceImpl = new PracticeImpl();
        return Observable.defer(() -> PracticeImpl.method1())
                .flatMap(matchingInteger -> practiceImpl.method2()
                        .flatMap(map -> Observable.fromIterable(map.entrySet()))
                        .filter(entry -> entry.getKey().equals(matchingInteger))
                        .map(Map.Entry::getValue) // Map to values
                        .map(value -> "Matching Integer: " + matchingInteger + ", String: " + value));
               
    }


}
