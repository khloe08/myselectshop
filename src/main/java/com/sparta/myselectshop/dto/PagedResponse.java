package com.sparta.myselectshop.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;

import java.util.List;

@Getter
public class PagedResponse<T>{

    private List<T> content;
    private int page;
    private int size;
    private long totalElements;
    private int totalPages;


    public PagedResponse(Page<T> page) {
        this.content = page.getContent();
        this.page = page.getNumber();
        this.size = page.getSize();
        this.totalElements = page.getTotalElements();
        this.totalPages = page.getTotalPages();
    }


}
