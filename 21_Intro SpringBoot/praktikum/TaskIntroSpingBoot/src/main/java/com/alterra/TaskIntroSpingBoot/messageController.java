package com.alterra.TaskIntroSpingBoot;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/messages")
public class messageController {
    @GetMapping
    public modelMessage getMessage(){
        modelMessage mMessage = new modelMessage();
        mMessage.setSucces(true);
        mMessage.setMessage("Succes");
        mMessage.setData("Hello World");

        return mMessage;
    }
    @DeleteMapping
    public modelMessage deleteMessage(){
        modelMessage mMessage = new modelMessage();
        mMessage.setSucces(true);
        mMessage.setMessage("Succes");
        mMessage.setData("Hello World");

        return mMessage;
    }
    @PostMapping
    public modelMessage postMessase(){
        modelMessage mMessage = new modelMessage();
        mMessage.setSucces(true);
        mMessage.setMessage("Succes");
        mMessage.setData("Hello World");

        return mMessage;
    }


}
