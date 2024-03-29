# springboot2-kafka-example
스프링 부트 2 - Kafka 연동 예제

테스트된 JDK Version: OpenJDK 17
-----
## 프로젝트 실행해보는 방법
1. 이 리포지토리를 클론 합니다.
2. Spring Boot Dashboard를 사용할 수 있는 환경에서 프로젝트를 실행합니다.
3. Post Man과 같은 API 테스트 도구에서, POST 요청으로 `http://<ip>:<port>/kafka` URL로 `message` key 값을 가진 value를 전송합니다.
4. 해당 value가 콘솔 및 터미널에서 정상적으로 뜨는지 확인합니다.

## 프로듀서와 컨슈머의 개념
프로듀서: 메시지를 전송하는 역할을 하는 서버 혹은 애플리케이션을 일컫는 용어.
컨슈머: 메시지를 받아서 소비하는 역할을 하는 서버 혹은 애플리케이션을 일컫는 용어.

## 카프카가 필요한 이유
카프카는 전통적인 개발 방식인 `Monolithic architecture`방식에서 벗어나 `Micro service architecture`로 변화하면서 관리해야 할 서버의 개수가 늘어남에 따라 발생한 실시간 모니터링의 어려움 때문에 탄생하게 되었다. 기존에는 `End To End` 방식, 즉 모든 서버를 `망형 (Mesh Topology)`으로 연결하였으나, 서버의 개수가 늘어남에 따라 관리의 어려움이 생겨 `End To End` 방식으로 연결하는데에는 한계가 있었다. 따라서 서버간의 메시지를 간단하게 처리하기 위해 중앙에서 집중적으로 메시지를 처리할 애플리케이션이 필요하게 되었는데, 그 필요성에 의해 생긴 것이 바로 카프카다.  
![Kafka가 없을 때](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FCumy4%2FbtrcGT9vE3X%2F75V8w66NbBzCvY6tHVDB41%2Fimg.jpg)
![Kafka가 있을 때](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fbkeh81%2FbtrcGkGjJsN%2FfdBFWIq2h8kupcNd5zP2KK%2Fimg.jpg)
출처: "카프카, 데이터 플랫폼의 최강자" (고승범, 공용준 지음)
