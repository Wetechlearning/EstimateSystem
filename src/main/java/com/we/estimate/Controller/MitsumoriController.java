package com.we.estimate.Controller;

import com.we.estimate.Entity.*;
import com.we.estimate.Search.MitsumoriShosai;
import com.we.estimate.Service.McTt510Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MitsumoriController {

    @Autowired
    private McTt510Service mcTt510Service;

    @RequestMapping("/mitsumori")
    public String mitsumori(Model model){
        model.addAttribute("mitsumoriSearch",new McTt510());
        return "mitsumorinyuryoku";
    }

    @RequestMapping("/mitsumori/nyuryoku")
    public String mitsumoriNyuryoku(Model model, @ModelAttribute("mitsumoriSearch") McTt510 mcTt510) {
        if (mcTt510.getNoMitsumori()==null){
            return "failure";
        }
        if (mcTt510.getTdSaishuKoshin()==null){
            return "failure";
        }
        if (mcTt510.getTdSakusei()==null){
            return "failure";
        }
        mcTt510.setSuHan((short) 1);
        int i = mcTt510Service.insert(mcTt510);
        if (i != 1){
            return "mitsumoriIchiran";
        }
        System.out.println(mcTt510);
        model.addAttribute("mitsumoriShosai",mcTt510);
        return "mitsumoriIchiran";
    }



}
