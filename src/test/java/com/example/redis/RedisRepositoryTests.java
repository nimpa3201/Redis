package com.example.redis;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class RedisRepositoryTests {

    @Autowired
    private ItemRepository itemRepository;

    @Test
    public void createTest(){
        //객체를 만들고
        Item item = Item.builder()
            .id(1L)
            .name("keyboard")
            .description("Very Expansive keyboard")
            .price(1000000)
            .build();
        //save 호출한다.
        itemRepository.save(item);
    }

    @Test
    public void readOneTest(){
        Item item = itemRepository.findById(1L)
            .orElseThrow();
        System.out.println(item.getDescription());
    }

    @Test
    public void updateTest() {
        Item item = itemRepository.findById(1L)
            .orElseThrow();
        item.setDescription("on Sale!!");
        item = itemRepository.save(item);
        System.out.println(item.getDescription());

    }

    @Test
    public void deleteTest(){
        itemRepository.deleteById(1L);
    }

}
