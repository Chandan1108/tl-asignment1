package org.example;

import org.w3c.dom.ls.LSOutput;
import rx.*;
import rx.observables.ConnectableObservable;

import java.nio.charset.Charset;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.Random;
import java.util.function.Consumer;


public class Main {
    public static void main(String[] args) {
        //createObservableWithJust();

        /*Observable<Integer> observable = Observable.just(1,2,3,4,null);
        ConnectableObservable<Integer> observable1 = Observable.just(5,6,7,8).publish();
        observable1.subscribe(item-> System.out.println(item));
        observable1.connect();
        Observable<Integer> obv = Observable.range(5,10);
        //obv.subscribe(item-> System.out.println(item));*/

        //Observable<Long> intervalObservable = Observable.interval(1, TimeUnit.SECONDS);
       // intervalObservable.subscribe(item-> System.out.println(item));

        //Single.just("single").subscribe(item-> System.out.println(item));

//        /Observable obj = Observable.create(subscriber -> {
//            while(i>0){
//
//            }
//            (i)-> {
//                i=1;
//                subscriber.onNext(i);
//            }});
//        obj.subscribe(item-> System.out.println(item));

       // Observable observable = Observable.error(new Exception("An exception"));
        /*observable.subscribe(item-> System.out.println(item));

        List<Integer> list = Arrays.asList(5,6,7,8);
        Observable<Integer> observable1 = Observable.from(list);
        observable1.subscribe(item-> System.out.println(item));

        Observable<Integer> observable2 = Observable.create(emitter->{
            emitter.onNext(9);
            emitter.onNext(10);
        });*/


        /*Observable<String> sources = Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {

            }
        });

        Observer<Integer> observer = new Observer<Integer>() {
            @Override
            public void onCompleted() {
                System.out.println("complete");
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(throwable.getLocalizedMessage());
            }

            @Override
            public void onNext(Integer integer) {
                System.out.println(integer);

            }
        };
        //observable.subscribe(observer);
        List<Country> countries = new ArrayList<>();
        countries.add(new Country("india","Rupees", 120000000));
        countries.add(new Country("china","uyon",1300000));
        CountriesServiceSolved css = new CountriesServiceSolved();
        System.out.println("Hello world!: "+ css.countryNameInCapitals(countries.get(0)).subscribe(System.out::println));*/
        //String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
        System.out.println("Hello world!: ");

        /*List<Integer> listnew= new ArrayList<Integer>();
        int i=1;
        Random randomNum = new Random();
        while(i<=100){
            listnew.add(randomNum.nextInt(100));
            i++;
        };
        listnew.forEach(System.out :: println);*/

        ObservablePractice  observablePractice = new ObservablePractice();

        Observable fromMethod2 = observablePractice.method2(100);

        Observable fromMethod1 = observablePractice.method1();

        observablePractice.method2(100).subscribe(System.out::println);






    }
}