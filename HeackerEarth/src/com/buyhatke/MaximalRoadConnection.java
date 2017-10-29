package com.buyhatke;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;


public class MaximalRoadConnection {

	static int V;
	static LinkedList<Integer> adj[];
	static Boolean visited[];
	static Boolean specVisted[];
	static Map<Integer, Boolean> specialMap = new HashMap<Integer, Boolean>();

	static void addEdge(int u, int v) {
		adj[u].add(v);
		adj[v].add(u);
	}

	static void DFSUtil(int v) throws Exception{
		visited[v] = true;
		if (specialMap.get(v + 1))
			specVisted[v] = true;
		Iterator<Integer> i = adj[v].iterator();
		int n;
		while (i.hasNext()) {
			n = i.next();
			if (!visited[n])
				DFSUtil(n);
		}

	}

	public static void main(String arg[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String inputArr[] = input.split(" ");
		int noCities = Integer.parseInt(inputArr[0]);
		int noSpCites = Integer.parseInt(inputArr[1]);
		int noRoad = Integer.parseInt(inputArr[2]);

		input = br.readLine();
		inputArr = input.split(" ");
		
		// Intialized Graph
		adj = new LinkedList[noCities];
		visited = new Boolean[noCities];
		specVisted = new Boolean[noCities];

		for (int i = 1; i <= noCities; i++) {
			specialMap.put(i, false);
			adj[i-1] = new LinkedList<Integer>();
			visited[i-1] = false;
			specVisted[i-1] = false;
		}

		for (int i = 0; i < noSpCites; i++) {
			specialMap.put(Integer.parseInt(inputArr[i]), true);
		}

		

		// get the road and add this into Graph.
		for (int i = 0; i < noRoad; i++) {
			input = br.readLine();
			inputArr = input.split(" ");
			int u = Integer.parseInt(inputArr[0]);
			int v = Integer.parseInt(inputArr[1]);
			addEdge(u - 1, v - 1);
		}

		BigInteger  res = new BigInteger("0");
		for (int i = 1; i <= noCities; i++) {

			/*if (specialMap.get(i)) {
				res += 1;
				// System.out.println("Adding Result Value " + res);
			}*/

			DFSUtil(i - 1);
			
			  for( int k=0; k < noCities; k ++) System.out.print(specVisted[k]
			  + " "); System.out.println("specialCity visited above");
			 
			for (int j = 0; j < noCities; j++) {
				if ( specVisted[j])
					res = res.add(BigInteger.valueOf(1));

				specVisted[j] = false;
				visited[j] = false;

			}
			// System.out.println("result value of  " + i + " " + res);

		}
		System.out.println(res);

	}

}
