package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        if(leftBorder < rightBorder){
            return IntStream.rangeClosed(leftBorder, rightBorder).filter(number -> number % 2 == 0).reduce(0,Integer::sum);
        }else {
            return IntStream.rangeClosed(rightBorder, leftBorder).filter(number -> number % 2 == 0).reduce(0,Integer::sum);
        }
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        if(leftBorder < rightBorder){
            return IntStream.rangeClosed(leftBorder, rightBorder).filter(number -> number % 2 != 0).reduce(0,Integer::sum);
        }else {
            return IntStream.rangeClosed(rightBorder, leftBorder).filter(number -> number % 2 != 0).reduce(0,Integer::sum);
        }
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map(item -> item * 3 + 2).reduce(0, Integer::sum);
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map(item -> item % 2 == 0 ? item : item * 3 + 2).collect(Collectors.toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        return arrayList.stream().filter(item -> item % 2 != 0).map(item -> item * 3 + 5).reduce(0, Integer::sum);
    }

//    public double getMedianOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

    public double getAverageOfEven(List<Integer> arrayList) {
        return  arrayList.stream().filter(item -> item % 2 == 0).mapToDouble(item -> item).average().orElse(0);
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        return arrayList.stream().filter( item -> item % 2 == 0).distinct().collect(Collectors.toList());
    }

//    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
}
