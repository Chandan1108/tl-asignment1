package org.example;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observers.TestObserver;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import io.reactivex.rxjava3.core.Completable;
import static org.junit.Assert.*;
import static rx.schedulers.Schedulers.test;
//import static org.junit.jupiter.api.Assertions.*;

public class PracticeImplTest {

    @Test
    public void testMethod3() {
        PracticeImpl practiceImpl = new PracticeImpl();
        practiceImpl.method3()
                      .test()
                      .assertComplete()
                      .assertNoErrors();

        Observable<Integer> observable = Observable.range(1, 100);
        TestObserver<Integer> testObserver1 = observable.filter(i -> i % 2 != 0).test();
        testObserver1.assertNoErrors();
        List<Integer> emittedValues = testObserver1.values();
        for (Integer value : emittedValues) {
            assertTrue("Found an even number: " + value, value % 2 != 0);
        }
    }

    @Test
    public void testMethod2() {

        PracticeImpl practice = new PracticeImpl();
        Map<Integer, String> map =practice.method2()
                .test()
                .values().get(0);
        assertNotNull(map);
        assertFalse(map.isEmpty());



    }


    @Test
    public void testMethod1() {
        PracticeImpl practice = new PracticeImpl();

        practice.method1()
                .test()
                .assertValueCount(100)
                .assertComplete()
                .assertNoErrors();

    }

    @Test
    public void testresults() {
        PracticeImpl practice = new PracticeImpl();

        practice.results()
                .test()
                .assertComplete()
                .assertNoErrors();

    }

}