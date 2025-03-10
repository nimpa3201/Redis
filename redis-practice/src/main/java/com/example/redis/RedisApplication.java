package com.example.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
새로운 Spring Boot 프로젝트를 만들어 다음을 진행해보자.

1. 주문 ID, 판매 물품, 갯수, 총액, 결제 여부에 대한 데이터를 지정하기 위한 `ItemOrder` 클래스를 `RedisHash`로 만들고,
    1. 주문 ID - String
    2. 판매 물품 - String
    3. 갯수 - Integer
    4. 총액 - Long
    5. 주문 상태 - String
2. 주문에 대한 CRUD를 진행하는 기능을 만들어보자.
    1. `ItemOrder`의 속성값들을 ID를 제외하고 클라이언트에서 전달해준다.
    2. 성공하면 저장된 `ItemOrder`를 사용자에게 응답해준다.
- 해설 코드

    [practice-1.zip](attachment:808f7f7e-0720-4f39-843f-38da03171eba:practice-1.zip)


새로운 Spring Boot 프로젝트를 만들어 2번 실습의 기능을 실제로 만들어보자.

1. 실제 Entity 등은 만들지 않고, Redis에 데이터만 저장해보자.
 */

@SpringBootApplication
public class RedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisApplication.class, args);
	}

}
