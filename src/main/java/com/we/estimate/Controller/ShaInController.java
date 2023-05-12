package com.we.estimate.Controller;

import com.we.estimate.Entity.ShaIn;
import com.we.estimate.Service.ShaInService;
import com.we.estimate.Tools.UserTools;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/shaIn")
@Slf4j
public class ShaInController {

    @Autowired
    private ShaInService shaInService;

    private final UserTools userTools = new UserTools();

    // 社員入力画面
    @GetMapping("/add")
    public String showShaInForm(Model model, HttpServletResponse response) {

        // キャッシュ禁用
        userTools.disableCache(response);

        // shaIn　入力データ保存モデル
        model.addAttribute("shaIn", new ShaIn());
        
        // 新規モード
        model.addAttribute("mode", "add");

        return "shainadd";
    }

    // 社員入力画面 シートモデル
    @PostMapping("/sheet")
    public String showShaInFormSheet(Model model) {

        // shaIn　入力データ保存モデル
        model.addAttribute("shaIn", new ShaIn());

        // シートモード　表示
        model.addAttribute("mode", "sheet");

        return "shainadd";
    }

    // 新規社員入力処理
    @PostMapping("/submit")
    public String submitShaInForm(@ModelAttribute("shaIn") ShaIn newshaIn) {

        // Mybatis引数タイプ データ保存
        List<ShaIn> shaInsList = new ArrayList<>();

        // 時間設定
        LocalDateTime now = LocalDateTime.now();
        newshaIn.setTdInsert(Timestamp.valueOf(now));

        // Listにデータ追加
        shaInsList.add(newshaIn);

        //　データ保存
        shaInService.saveShaIn(shaInsList);

        return "success2";
    }

}

