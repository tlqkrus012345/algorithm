### Vector
* Vector 는 Object[] 배열을 사용합니다. 따라서 ArrayList 와 유사합니다. 
* 요소 접근에는 빠른 성능을 보입니다
* 항상 여러 스레드가 동시에 데이터에 접근을 시도하면 순차적으로 처리하도록 합니다. 즉 항상 동기화를 지원합니다.
* 하지만 단일 스레드에서도 동기화를 지원하여 ArrayList 에 비해 성능이 미약하게 느립니다.

### Stack
* vector 를 상속받은 클래스입니다
* LIFO (후입선출) 특징을 가집니다.
* pop(), push(), search(Object o)(상단부터 시작한다)