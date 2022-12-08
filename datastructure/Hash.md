* 임의의 길이를 갖는 데이터를 고정된 길이의 데이터로 매핑하는 것입니다. 
이러한 기능을 하는 함수를 해시 함수라 합니다.
* 동일한 해시 알고리즘에 대한 동일한 값에 대해서는 동일한 다에제스트(해시 함수의 결과 값)를 갖기 때문에 
해시 함수를 이용합니다.
* 특정 값에 대한 다이제스트는 변하지 않기 때문에 이 다이제스트의 값을 배열의 위치로 활용하는 것입니다.
* 데이터가 많아지면 해싱 값이 충돌하는 현상이 발생합니다(서로 다른 두 개의 키가 같은 인덱스로 해싱)
* 그럼에도 해시 테이블을 사용하는 이유는 적은 자원으로 많은 데이트를 효율적으로 관리하기 위함과
하드티스크, 클라우드에 존재하는 무한한 데이터들을 유한한 개수의 해시값으로 매핑하면 적은 메모리로도 프로세스
관리가 가능해집니다.
* 충돌 문제를 해결하기 위해 
  1) open addressing

  삽입하려는 해시 버킷이 이미 사용 중인 경우 다른 해시 버킷에 해당 자료를 삽입하는 방식입니다.  

  장점은 연속된 공간에 데이터를 저장하기 때문에 캐시 효율이 좋아집니다.
  
  단점은 해시충돌이 발생하면 해당 객체의 인덱스 값이 바뀌어 버립니다. 또한 테이블에 저장된 데이터의 개수가
  많아질수록 성능이 저하됩니다.

  2) separate chaining

  장점은 해시충돌이 발생하여도 연결리스트로 연결되기에 index 가 변하지 않습니다.
  
  부하율에 따라 성능이 저하되며 부하율이 적을 경우에는 open addressing 을 추천합니다.