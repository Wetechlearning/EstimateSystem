package com.we.estimate.Controller;

import com.we.estimate.Entity.ShaIn;
import com.we.estimate.InputCheckMessage.ShaInInputCheck;
import com.we.estimate.Service.ShaInService;
import com.we.estimate.Tools.UserTools;
import com.we.estimate.Tools.ValidationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@Controller
@RequestMapping("/shaIn")
@Slf4j
public class ShaInController {

    @Autowired
    private ShaInService shaInService;

    private final UserTools userTools = new UserTools();
    private final ValidationException validationException = new ValidationException(new HashMap<>());
    private final ShaInInputCheck shaInInputCheck = new ShaInInputCheck();

    // 社員入力画面
    @GetMapping("/add")
    public String showShaInForm(Model model, HttpServletResponse response) {

        // キャッシュ禁用
        userTools.disableCache(response);

        // shaIn　入力データ保存モデル
        model.addAttribute("shaIn", new ShaIn());
        
        // 新規モード
        model.addAttribute("mode", "add");

        // エラーメッセージ
        model.addAttribute("error", new HashMap<>());

        return "shainadd";
    }

    // 社員入力画面 入力チェック
    @PostMapping("/add")
    public String showShaInFormError(Model model,
                                     HttpSession session,
                                     @ModelAttribute("shaIn") ShaIn newshaIn,
                                     HttpServletResponse response) throws IOException {
        // shaIn　入力データ読み取り
        session.setAttribute("shaIn", newshaIn);

        try {
            validationException.checkNullOrEmpty(
                    newshaIn,
                    shaInInputCheck.isNullOrEmptyCheckingKeys,
                    shaInInputCheck.errorMap
            );
        } catch (ValidationException e) {

            // 新規モード　表示
            model.addAttribute("mode", "add");
            // エラーメッセージ
            model.addAttribute("error", e.getErrorMessages());

            return "shainadd";
        }

        response.sendRedirect("sheet");

        return null;
    }


    // 社員入力画面 シートモデル
    @GetMapping("/sheet")
    public String showShaInFormSheet(Model model,
                                     HttpSession session) {
        // shaIn　入力データ保存モデル
        // session から読み取り
        ShaIn newshaIn = (ShaIn) session.getAttribute("shaIn");

        // 如果 newshaIn 为 null，创建一个新的 ShaIn 实例
        if (newshaIn == null) {
            newshaIn = new ShaIn();
        }

        model.addAttribute("shaIn", newshaIn);

        // シートモード　表示
        model.addAttribute("mode", "sheet");
        // エラーメッセージ
        model.addAttribute("error", new HashMap<>());

        return "shainadd";
    }

    // 新規社員入力処理
    @PostMapping("/submit")
    public String submitShaInForm(HttpSession session) {
        // 从 session 中获取数据
        ShaIn newshaIn = (ShaIn) session.getAttribute("shaIn");

        System.out.println(newshaIn);

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

