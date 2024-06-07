package org.example;

import rx.Observable;
import rx.Single;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ObservablePractice {

    public Observable<Integer>method3() {
        return Observable.range(1,100).filter(i->i%2!=0);
    }

    public Observable<Map<Integer,String>> method2(int i) {
        List<String> strList = new ArrayList<String>();
        strList= randomString(100);
        return Observable.fromIterable(strList).toMap(new Random().nextInt(100));

    }

    public Observable<Integer>method1() {
        List<Integer> listnew= new ArrayList<Integer>();
        listnew=randomNumber();
        //Observable.fromIterable(listnew);

    }

    public static List<String> randomString(int value) {
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


        return generatedString;
    }

    public static List<Integer> randomNumber() {
        List<Integer> listnew= new ArrayList<Integer>();
        int i=1;
        Random randomNum = new Random();
        while(i<=100){
            listnew.add(randomNum.nextInt(100));
            i++;
        };
        return listnew;
    }




}
