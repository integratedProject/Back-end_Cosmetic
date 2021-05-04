package com.example.cosmetic2.Exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
public class ExceptionsResponse {
    public static enum ERROR_CODE {
        ITEM_DOES_NOT_EXIST(1001),
        ITEM_ALREADY_EXIST(2001);
        private int value;

        ERROR_CODE(int value) {
            this.value = value;
        }
    }

    private ERROR_CODE errorCode;
    private String message;
    private LocalDateTime dateTime;

}
