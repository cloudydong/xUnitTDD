# xUnit TDD
> 간략하게 만들어 봅니다.

[X] WasRun 

[X] TestCase

[X] TestCaseTest 

[X] SetUp

[X] refactorWasRun
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
