package per.itachi.java.version.jdk8.util.concurrent;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentHashMapEntry {
	
	public static void main(String[] args) {
//		int initSize = 16;
		int loadFactorSize = 256; // 12
		ConcurrentMap<String, String> concurrentMap = new ConcurrentHashMap<>();
		System.out.printf("The size of ConcurrentMap is %d %n", concurrentMap.size());
		for (int i = 0; i < loadFactorSize; ++i) {
			// if either key or value is null, NullPointerException will be thrown.
			concurrentMap.put(UUID.randomUUID().toString(), UUID.randomUUID().toString());
		}
		System.out.printf("The size of ConcurrentMap is %d %n", concurrentMap.size());
	}
}
