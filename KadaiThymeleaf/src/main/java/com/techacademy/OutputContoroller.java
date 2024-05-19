package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OutputContoroller {

    @PostMapping("/output")
    public String postOutput(@RequestParam("val") String val, Model model) {
        //フォームが空だったら"null"を設定
        if (val.isEmpty()) {
            model.addAttribute("val", "null"); 
        }
        else {
            // フォームから送信されてきた値をModelに登録
            model.addAttribute("val", val);
        }
        // output.htmlに画面遷移
        return "output";
    }
}
