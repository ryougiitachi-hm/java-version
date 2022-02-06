package per.itachi.java.version.jdk5.util.concurrent;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentHashMapEntry {
	
	public static void main(String[] args) {
		ConcurrentMap<String, String> concurrentMap = new ConcurrentHashMap<String, String>();
		System.out.printf("%s %n", concurrentMap);
	}
}
