# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 기능 목록

1. 쉼표로 구분된 문자열 입력 시 배열 형태로 변경(자동차 목록저장)
2. 자동차 전진 로직 개발
    - 0~9사이의 숫자중 1개를 추출하여 이 값이 4이상일 경우에만 전진
    - isMoveForward() input : 0~9 , output : boolean
3. 자동차 목록 중 우승자동차를 추출한다
    - List<Car> 목록 중 car.moveDistance가 가장 큰 자동차가 우승
    - 우승이 복수라면 쉼표로 구분
    - getWinner(List<Car>) input : List<Car>  output : String
4. 자동차 이름입력 InputView 작성
    - 쉼표 기준으로 구분하며, n대의 자동차 이름 입력 가능
5. 시도 횟수 InputView 작성
    - 시도 횟수의 제한은 없다.
6. 게임 진행 OutputView 작성
    - 게임 진행 시 자동차이름 출력
    - 전진 데이터 막대형태 누적 출력
7. 게임 완료 후 우승 자동차 출력 OutputView 작성
8. 잘못된 값 입력 시 [ERROR]로 시작하는 메시지 출력 후 재입력