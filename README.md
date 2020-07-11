# xUnit TDD
> 간략하게 만들어 봅니다.

[X] WasRun 

[X] TestCase

[] 

[] 

## Branch
> 각 단계별로 브랜치를 나눕니다.

* WasRun
   * 조건: WasRun은 실행했냐를 확인할 수 있어야함
   * 결과: WasRun은 3가지 문제를 가지고 있다.
   * 문제: WasRun을 동적으로 실행하지 못함, WasRun은 실행여부만 확인해야하는데 값 비교도 가지고 있음, 예상값과 결과값 비교하는데 오직 boolean값만 비교함

* TestCase
   * 조건: 동적으로 실행
   * 결과: WasRun은 실행여부 확인, Assert는 두 값 비교, TestCase는 동적으로 메소드를 실행 그리고 템플릿 패턴이 됨
   * 문제: main에 기능별로 메소드가 잘 분리됨 이제 그걸로 TestCase를 테스트해야함
