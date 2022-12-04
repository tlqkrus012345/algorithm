### Queue Interface 

* 큐 인터페이스는 선형 자료구조로 주로 순서가 있는 데이터를 기반으로 FIFO (선입선출)을 위해 만들어진 인터페이스입니다.
* Queue / Deque Interface 를 구현하는 클래스 : LinkedList, ArrayDeque, PriorityQueue


* Deque, Queue 를 LinkedList 처럼 Node 객체로 연결해서 관리하려면 LinkedList
* ArrayList 를 Object[] 배열로 구현해서 관리하려면 ArrayDeque 
---

ArrayDeque<T> arrayDeque = new ArrayDeque<>();
PriorityQueue<T> priorityQueue = new PriorityQueue<>();

Deque<T> arrayDeque = new ArrayDeque<>();
Deque<T> linkedListDeque = new LinkedList<>();

Queue<T> arrayDeque = new ArrayDeque<>();
Queue<T> linkedListDeque = new LinkedList<>();
Queue<T> priorityQueue = new PriorityQueue<>();