package com.honeywell;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class CrazyTree {

    public static ArrayList<Long> arr = new ArrayList<Long>();
    public static HashMap<Integer, Long> sum = new HashMap<Integer, Long>();

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int l = Integer.parseInt(line[0]);
        int leafNodes = (int) Math.pow(2, l - 1);
        initList(leafNodes);
        int q = Integer.parseInt(line[1]);

        for (int i = 0; i < q; i++) {
            String[] kk = br.readLine().split(" ");
            int lev = Integer.parseInt(kk[0]);
            int x = Integer.parseInt(kk[1]);
            int y = Integer.parseInt(kk[2]);
            int l_shift = 0;

            for (int i1 = l; i1 > lev; i1--) {
                l_shift += Math.pow(2, i1 - 1);
            }            
            long sum = 0;
            for (int i2 = x; i2 <= y; i2++) {
                sum += arr.get(l_shift + i2 - 1);
            }
            System.out.println(sum);
        }
    }

    public static void initList(int nodes) {
        for (long i = 1; i <= nodes; i++) {
            arr.add(i);
        }
        for (int i = 0; i < arr.size() - 1; i += 2) {
            Long mul = ((arr.get(i) % 1299709) * arr.get(i + 1) % 1299709) % 1299709;
            arr.add(mul);
        }        
        System.out.println(arr);
    }
}