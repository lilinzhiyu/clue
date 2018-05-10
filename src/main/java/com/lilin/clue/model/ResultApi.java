package com.lilin.clue.model;

import lombok.*;

/**
 * Created by xiaopang on 2018/5/10.
 */
@Data
@EqualsAndHashCode
@Builder
public class ResultApi {
    private Boolean isSuccess;
    private String result;
    private ErrorEnum errorMessage = null;
}
