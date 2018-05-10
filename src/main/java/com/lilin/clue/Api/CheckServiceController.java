package com.lilin.clue.Api;

import com.lilin.clue.model.ErrorEnum;
import com.lilin.clue.model.ResultApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by xiaopang on 2018/5/10.
 */
@RestController
public class CheckServiceController extends BaseController{

    @GetMapping("/user")
    private ResultApi checkUserAccount(HttpServletRequest requester) {
        String path = requester.getContextPath() + "  |  " + requester.getRequestURL() + "  |  " + requester.getRequestURI();
        return ResultApi.builder()
                .isSuccess(true)
                .result(path)
                .errorMessage(ErrorEnum.SERVICE_OK)
                .build();
    }
}
