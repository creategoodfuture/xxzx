package com.example.controller;

import com.example.service.WxSignatureCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WxSignatureCheckController {

    @Autowired
    private WxSignatureCheckService wxSignatureCheckService;

    @RequestMapping("/wxSignatureCheck")
    public String wxSignatureCheck(
            @RequestParam(value = "signature") String signature,
            @RequestParam(value = "timestamp") String timestamp,
            @RequestParam(value = "nonce") String nonce,
            @RequestParam(value = "echostr") String echostr
    ){
        return wxSignatureCheckService.wxSignatureCheck(signature, timestamp, nonce, echostr);
    }

}
