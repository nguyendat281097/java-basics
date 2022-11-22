package com.nvd.training.dto;

import lombok.Data;

@Data
public class FileDto {
    private String name;
    private String url;
    private String type;
    private long size;

    public FileDto(String name, String url, String type, long size) {
        this.name = name;
        this.url = url;
        this.type = type;
        this.size = size;
    }
}