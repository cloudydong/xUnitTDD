# xUnit TDD
> 간략하게 만들어 봅니다.

[X] WasRun 

[X] TestCase

[X] TestCaseTest 

[X] SetUp

[X] refactorWasRun

[X] MethodLogv1 && MethodLogv2

[X] stopWatchWasRun

[X] TestResult 

[X] testFailedResult

[X] TestSuite

[X] Test

[] refacTestSuite
## Branch
> 각 단계별로 브랜치를 나눕니다.

* WasRun
   * 조건: WasRun은 실행했냐를 확인할 수 있어야함
   * 결과: WasRun은 3가지 문제를 가지고 있다.
   * 문제: WasRun을 동적으로 실행하지 못함, WasRun은 실행여부만 확인해야하는데 값 비교도 가지고 있음, 예상값과 결과값 비교하는데 오직 boolean값만 비교함

* TestCase
   * 조건: 동적으로 실행
   * 결과: WasRun은 실행상태만 변화하는 클래스, Assert는 실행여부 확인하는 클래스, TestCase는 동적으로 메소드를 실행하는 클래스 그리고 템플릿 패턴이 됨
   * 문제: main에 기능별로 메소드가 잘 분리됨 이제 그걸로 TestCase를 테스트해야함
   
* TestCaseTest
  * 조건: TestCase를 상속한 테스트를 만들어 본다.
  * 결과: 메인에 있던 실행여부를 확인하는 모듈을 테스트하는 TestCaseTest 객체의 testRunning을 테스트? 
  * 문제: 이제 템플릿 패턴을 만들었기에 쉽게 메소드 사이사이에 원하는 메소드를 끼어 넣을 수 있음 setUp과 tearDown 만들기
   
* SetUp
  * 조건: SetUp과 TearDown을 TestCase템플릿에 만들어 본다.
  * 결과: TestCase에 SetUp과 TearDown을 만들고 TestCaseTest에 TestSetUp과 TestTearDown을 만들어 테스트했다. 각각 독립적인 인스턴스를 갖는 테스트였다.
  * 문제: WasRun의 상태가 setUP, wasRun, tearDown 3개가 되었고 각각 get메소드가 생겼다. 실행순서여부를 확인할 수 없고, 상태는 하나로 묶어서 전달할 필요가 있으며 중복코드는 제거해야한다.
  
* refactorWasRun
  * 조건: WasRun의 상태를 하나로 합치고 상태에 순서를 부여한다.
  * 결과: 상태를 List로 만들고 List에 메소드명을 add 했다.
  * 문제: List로 괜찮은가? 순서+실행여부를 확인하는 객체가 필요하다. 그리고 메소드명을 add하는 작업이 중복된다.
  
* MethodLogv1 && MethodLogv2
  * 조건: 순서와 실행여부를 확인하는 객체를 만든다. add작업을 바꾼다.
  * 결과: 실행한 메소드 이름을 담는 객체 MethodLog를 만들었다. MethodLog는 addCurrentMethodName라는 메소드를 가지고 있어 실행한 메소드 이름을 자신이 갖고있는 리스트에 추가한다.
  * 문제: 실행한 메소드 이름을 받는법은 2가지이다. String currentMethodName = new Object() {}.getClass().getEnclosingMethod().getName(); 와 String currentMethodName = Thread.currentThread().getStackTrace()[1].getMethodName(); 이 두가지 이다. 두 방법은 성능차이를 보일것 같다. 이것은 테스트 해봐야 안다.
  
* stopWatchWasRun
  * 조건: 메소드 이름 받는법 2가지를 속도로 비교한다.
  * 결과: MethodLogv1이 두배 느렸다. MethodLog2의 또 다른 장점은 addCurrentMethodName안 getStackTrace()[2] 로 바꾸면 내부로 넘겨서 생략할수 있다.
  * 문제: 이제 본래의 목적인 테스트 결과 출력하기를 만들자.

* TestResult
  * 조건: 테스트의 결과를 출력한다.
  * 결과: 실행횟수랑 실패횟수를 출력한다.
  * 문제: 계속 늘어나는 TestCaseTest의 메소드를 정리할 필요가 느껴진다. WasRun에서 testBrokenMethod를 만들어 예외를 발생시키고, TestCase의 run에서 throw new RuntimeException을 지우면 assertEquals가 thorw 된걸 TestCase의 run에서 catch해버려서 비교가 틀려도 에러가 안뜬다.
   
* testFailedResult
  * 조건: assertEquals가 에러를 던지게한다. 동시에 WasRun에서 TestResult가 run, failed 횟수를 카운트하게한다.
  * 결과: 에러도 잘 던지고, 실행횟수랑 실패횟수를 출력한다.
  * 문제: 계속 늘어나는 TestCaseTest의 메소드를 정리할 필요가 느껴진다. TestSuite이 필요하다.
  
* TestSuite
  * 조건: TestSuite으로 TestCaseTest의 메소드를 정리한다.
  * 결과: TestCaseTest들이 하나의 TestSuite로 합쳐졌다.
  * 문제: TestSuite에 suite을 넣을수 있는 컴포지트 패턴으로 인터페이스가 필요하다.

* Test
  * 조건: TestSuite에 TestCaseTest를 넣고 suite도 넣을수 있게만든다.
  * 결과: Test 인터페이스를 만들고 구현체를 TestCase와 TestSuite으로 설정하여 됬다.
  * 문제: 메소드앞에 test를 붙인 관례를 이용하여 코드를 더 줄인다.
  
  
