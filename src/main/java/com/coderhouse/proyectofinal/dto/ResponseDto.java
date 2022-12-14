package com.coderhouse.proyectofinal.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class ResponseDto {
    private String message;
    private Map<String, String> response = new HashMap<>();

    public void putFieldErrors(String field, String message) {
        response.put(field, message);
    }
}
