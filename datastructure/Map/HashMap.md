* Map 인터페이스를 구현한 클래스로 해시 알고리즘을 사용하여 검색 속도가 빠릅니다.


#### entrySet()
```java
for(Map.Entry<K, V> entry : map.entrySet()) {
    entry.getKey() + entry.getValue()
}
```
#### keySet()
```java
for(String key : map.keySet()){
    String value = map.get(key)
}
```
#### entrySet().iterator()
```java
Iterator<Map.Entry<K, V>> iter = map.entrySet().iterator;
while(iter.hasNext()){
    Map.Entry<K, V> iters = iter.next();
    String key = entry.getKey();
    String value = entry.getValue();
}
```
#### Stream
```java
// Stream 사용
map.entrySet().stream().forEach(entry-> {
	System.out.println("[key]:" + entry.getKey() + ", [value]:"+entry.getValue());
});
	        
// Stream 사용 - 내림차순
map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(entry-> {
	System.out.println("[key]:" + entry.getKey() + ", [value]:"+entry.getValue());
});

// Stream 사용 - 오름차순
map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(entry-> {
	System.out.println("[key]:" + entry.getKey() + ", [value]:"+entry.getValue());
});
```