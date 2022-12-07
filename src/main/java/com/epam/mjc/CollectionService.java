package com.epam.mjc;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        return list.stream().filter(i-> i % 2 == 0).collect(Collectors.toList());
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        return list.stream().map(s-> s.toUpperCase(Locale.ROOT)).collect(Collectors.toList());
    }

    public Optional<Integer> findMax(List<Integer> list) {
        return list.stream().max(Integer::compare);
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        return list.stream().flatMap(Collection::stream).min(Comparator.naturalOrder());
    }

    public Integer sum(List<Integer> list) {
        return list.stream().reduce(0, (i1, i2) -> i2 += i1);
    }
}
