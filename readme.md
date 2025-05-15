# Spring Boot POST API 실습 요약

## 개요
- Java와 Spring Boot로 간단한 POST(등록) 및 GET(조회) REST API를 구현하고 직접 테스트함

## 주요 내용
- User 정보를 받아 등록하는 POST API, 전체 유저 목록을 반환하는 GET API 작성
- DB 없이 메모리(ArrayList)에 데이터 저장
- @RestController, @PostMapping, @RequestBody, @GetMapping 등 스프링 어노테이션 사용법 익힘

## 테스트 방법
- Postman이나 curl을 이용해 POST와 GET 요청을 전송하여 동작을 직접 확인
    - POST로 유저 정보 등록
    - GET으로 등록된 전체 유저 정보 조회

## 배운 점
- Spring Boot에서 RESTful API 기본 구조 및 테스트 방법 익힘
- 실습을 통해 HTTP 동작과 데이터 처리 방식 이해

## 참고
- 추후 DB 연동, 입력값 검증, 에러 처리 등으로 확장 가능
