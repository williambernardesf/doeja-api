package br.com.doeja.controller.dto;

public class ErrorDto {
    private String message;

    public ErrorDto(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
