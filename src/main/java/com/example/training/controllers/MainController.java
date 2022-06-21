package com.example.training.controllers;

import com.example.training.bl.Model;
import com.example.training.bl.ModelInterface;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@AllArgsConstructor
@Controller
public class MainController {

    final ModelInterface modelInterface;

    @GetMapping("/")
    public HttpEntity<String> get() {
        return new HttpEntity<>(modelInterface.get());
    }

}
