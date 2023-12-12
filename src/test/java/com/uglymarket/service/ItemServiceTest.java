package com.uglymarket.service;

import com.uglymarket.dto.request.ItemReqDTO;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ItemServiceTest {

    @Autowired
    private ItemService itemService;

    @DisplayName("상품 등록")
    @Test
    void saveItemTest() {
        ItemReqDTO itemReqDTO = ItemReqDTO.builder()
                .memberId("test")
                .price(10_000L)
                .title("title")
                .content("content")
                .build();

        Long id = itemService.saveItem(itemReqDTO);

        System.out.println("id = " + id);
        Assertions.assertThat(id).isEqualTo(2L);
    }
}