package org.example.springboard2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
    @RequestMapping("/list")
    public void list(){}
}
