package org.example;
//import io.reactivex.rxjava3.core.Observable;
import rx.*;
import java.lang.*;
import java.util.List;
import java.util.Map;
import java.util.concurrent.FutureTask;

class CountriesServiceSolved implements CountriesService{

    @Override
    public Single<String> countryNameInCapitals(Country country) {
        return Single.just(country.getName())
                .map((str)->str.toUpperCase());
    }

    public Single<Integer> countCountries(List<Country> countries) {
        //return Observable.fromIterable(countries).si;
                //.count();
        return null;

    }

    public Observable<Long> listPopulationOfEachCountry(List<Country> countries) {
        //return Observable.fromIterable(countries).flatMap(e->Observable.just(e.getPopulation()));
        return null;
    }

    @Override
    public Observable<String> listNameOfEachCountry(List<Country> countries) {

        //return Observable.fromIterable(countries).flatMap(e->Observable.just(e.getName()));
        return null;

        // put your solution here
    }

    @Override
    public Observable<Country> listOnly3rdAnd4thCountry(List<Country> countries) {
        //return Observable.fromIterable(countries).skip(2).take(2);
        return null;

    }

    @Override
    public Single<Boolean> isAllCountriesPopulationMoreThanOneMillion(List<Country> countries) {
        //return Observable.fromIterable(countries).filter(e->e.getPopulation()>1000000).isEmpty();
        return null;
    }

    @Override
    public Observable<Country> listPopulationMoreThanOneMillion(List<Country> countries) {
        //return Observable.fromIterable(countries).filter(e->e.getPopulation()>1000000);
        return null; // put your solution here
    }

    @Override
    public Observable<Country> listPopulationMoreThanOneMillionWithTimeoutFallbackToEmpty(final FutureTask<List<Country>> countriesFromNetwork) {

        return null; // put your solution here
    }

    @Override
    public Observable<String> getCurrencyUsdIfNotFound(String countryName, List<Country> countries) {
        return null; // put your solution here
    }

    @Override
    public Observable<Long> sumPopulationOfCountries(List<Country> countries) {
        return null; // put your solution here
    }

    @Override
    public Single<Map<String, Long>> mapCountriesToNamePopulation(List<Country> countries) {
        return null; // put your solution here
    }

    @Override
    public Observable<Long> sumPopulationOfCountries(Observable<Country> countryObservable1,
                                                     Observable<Country> countryObservable2) {
        return null; // put your solution here
    }

    @Override
    public Single<Boolean> areEmittingSameSequences(Observable<Country> countryObservable1,
                                                    Observable<Country> countryObservable2) {
        return null; // put your solution here
    }
}
