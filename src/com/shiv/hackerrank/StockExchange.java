package com.shiv.hackerrank;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Result {

  private Result() {}
  public static List<Integer> computePrices(List<Integer> s, List<Integer> p, List<Integer> q) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < s.size(); i++) {
           map.put(s.get(i), p.get(i));
        }
        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        int near = 0;
        for(int i = 0; i < q.size(); i++) {
            int target = q.get(i);
            for(Integer k: keys) {
              if(k <= target){
                  near = k;
              }
            }
            list.add(map.get(near));
        }
        return list;
    }
}

public class StockExchange {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        bufferedReader.readLine().trim();

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> p = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> q = IntStream.range(0, k).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> res = Result.computePrices(s, p, q);
        System.out.println(res);
        bufferedReader.close();
    }
}
