package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class KadaiController {

    @GetMapping("/kadai")
    
    public String getKadai() {
        
      // kadai.htmlに画面遷移
      return "kadai";

  }
    @GetMapping("/kadai/")
    public String getKadai(@RequestParam("previous") String previous,Model model) {
        
        //クエリパラメータが空だったら"null"を設定
        if (previous.isEmpty()) {
            model.addAttribute("previous", "null"); 
        }
        else {
            // クエリパラメータをModelに登録
            model.addAttribute("previous", previous);             
        }
        // kadai.htmlに画面遷移
        return "kadai";

    }
}
