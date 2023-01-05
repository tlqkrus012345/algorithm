#### HashTable
- 해시 테이블은 (Key, Value)로 데이터를 저장하는 자료구조 중 하나로 빠르게 데이터를 검색할 수 있는 자료구조입니다.
빠른 검색 속도를 제공하는 이유는 내부적으로 배열(버킷)을 사용하여 데이터를 저장하기 때문입니다.
각 Key값은 해시함수에 의해 고유한 index를 가지게 되어 바로 접근할 수 있으므로 평균 O(1)의 시간 복잡도로 데이터를 조회합니다.
하지만 index값이 충돌이 발생한 경우 Chanining에 연결된 리스트들까지 검색해야 하므로 O(N)까지 증가할 수 있습니다.

#### 충돌
- key 값은 다르지만, key 의 해시값이 같을 때 발생하는 충돌을 의미합니다 즉 중복되는 key 는 없지만, Hash 값은 중복될 수 있다는 뜻 입니다.

#### 충돌 해결방법
- Seperate Chaining 과 Open Addressing 2가지 방식으로 해결할 수 있다.
```markdown
Open Addressing : 추가적인 메모리를 사용하지 않기에, Seperate Chaining 에 비해 메모리 효율이 좋다.
Linear Probing : 선형 조사법 : 충돌이 발생한 해시값으로부터 일정한 값 만큼 건너뛰어 비어있는 Slot 에 데이터를 저장한다 ( + 1, +2, +3 ... )
Quadratic Probing : 이차 조사법 :선형 조사법이 1단위로 건너뛰었다면, 이차 조사법은 제곱수로 건너뛰어 빈 slot 을 탐색한다 (+1, +4, +9 ... )
Double Hashing : Linear / Quadratic Probing 은 탐사 이동폭이 일정하기 때문에, 특정 영역에 데이터가 몰리는 clustering 현상이 발생할 수 있다.(clustering -> 탐색시간이 길어지는 문제 발생) Clustering 문제를 해결하기 위해 2개의 해시함수를 사용하는 방식을 Double Hashing 이라 한다. 하나는 최초의 Hash 값을 얻을 때 사용하고, 두번 째는 collision 발생 시 탐사 이동폭을 얻기 위해 사용한다.

Seperate Chaining : Linked List (or Tree) 를 이용하여 Collision 을 해결한다. 
충돌이 발생시 Linked List 에 노드를 추가하여 데이터를 저장한다. 즉 같은 슬롯에 링크드 리스트를 계속 추가하여 데이터를 저장하는 것이다. 
삽입 시 : 서로 다른 두 key 가 같은 해시값을 가지면, linked list 에 노드를 추가하여 key - value 를 저장, 시간 복잡도는 O(1)
삭제 시 : 기본적으로 O(1), worst case 는 O(N)
조회 시 : 기본적으로 O(1), worst case 는 O(N). -> Worst case : 서로 다른 n 개의 key 가 동일한 해시값을 갖게 되면, 길이 n 의 linked list 를 생성한다. => 시간복잡도 O(N) 으로 증가. 
```
#### HashTable 과 HashMap
- 동기화 지원 여부와 null 값 허용 여부의 차이가 있습니다.

  - 해시 테이블(Hash Table)

병렬 처리를 할 때 (동기화를 고려해야 하는 상황) Thread-safe 하다.
Null 값을 허용하지 않는다.

  - 해시 맵(Hash Map)

병렬 처리를 하지 않을 때 (동기화를 고려하지 않는 상황) Thread-safe하지 않는다.
Null 값을 허용한다.
