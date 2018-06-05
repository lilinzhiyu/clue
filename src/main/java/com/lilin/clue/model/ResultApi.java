package com.lilin.clue.model;

import lombok.*;

/**
 * Created by xiaopang on 2018/5/10.
 */
@Data
@EqualsAndHashCode
@Builder
public class ResultApi<T> {
    private Boolean isSuccess;
    private T result;
    private ErrorEnum errorMessage;
}
