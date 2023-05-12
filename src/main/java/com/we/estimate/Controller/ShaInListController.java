package com.we.estimate.Controller;

import com.we.estimate.Entity.ShaIn;
import com.we.estimate.Entity.ShaInDataBase;
import com.we.estimate.Search.ShaInSearchResult;
import com.we.estimate.Service.ShaInService;
import com.we.estimate.Tools.UserTools;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/shaIn")
@Slf4j
public class ShaInListController {

    @Autowired
    private ShaInService shaInService;

    private ShaIn shaInSearchCondition = new ShaIn();
    private final UserTools userTools = new UserTools();

    //  1ページあたりに表示するアイテム数 デフォルト10
    int itemsPerPage = 10;

    // 社員一覧画面
    @GetMapping("/list")
    public String showShaInList(Model model, HttpServletResponse response) {

        // キャッシュ禁用
        userTools.disableCache(response);

        //  1ページあたりに表示するアイテム数
        itemsPerPage = 10;
        model.addAttribute("pageCount", itemsPerPage);


        // shaInSearch 検索条件のモデル
        // shaInModel 検索データのモデル
        model.addAttribute("shaInSearch", new ShaIn());
        model.addAttribute("shaInModel", new ShaInDataBase());

        // 参照モード 初期表示
        model.addAttribute("mode", "reference");

        return "shainlist";
    }

    // ページング検索　1ページ
    @PostMapping("list/search")
    @ResponseBody
    public ShaInSearchResult shaInSearchResult(@ModelAttribute("shaInSearch") ShaIn shaIn,
                                               @RequestParam(name = "page") int pageNum) {

        // Mybatis引数タイプ 検索
        Map<String, Object> paramMap = new HashMap<>();

        ShaInSearchResult shaInSearchResult = new ShaInSearchResult();
        // 検索条件保存　@GetMapping("list/search/page")ページング検索用
        shaInSearchCondition = shaIn;

        // ページ1
        Integer searchOffset = itemsPerPage*(pageNum-1)+1;
        Integer searchLimit = itemsPerPage*pageNum;

        // ページング検索　引数
        // offset オフセット
        // limit 検索最大数
        //　shaIn　検索条件
        paramMap.put("offset", searchOffset);
        paramMap.put("limit", searchLimit);
        paramMap.put("shaIn", shaInSearchCondition);

        int count = shaInService.searchCount(shaIn);
        List<ShaInDataBase> shaInDataBases = shaInService.getShaIns(paramMap);

        shaInSearchResult.setCount(count);
        shaInSearchResult.setData(shaInDataBases);

        return shaInSearchResult;
    }

    // ページング検索
    @GetMapping("list/search/page")
    @ResponseBody
    public ShaInSearchResult shaInSearchResultPage(@RequestParam(name = "page") int pageNum) {

        Map<String, Object> paramMap = new HashMap<>();

        ShaInSearchResult shaInSearchResult = new ShaInSearchResult();

        Integer searchOffset = itemsPerPage*(pageNum-1)+1;
        Integer searchLimit = itemsPerPage*pageNum;

        log.info("itemsPerPage: " + itemsPerPage);
        log.info("pageNum" + pageNum);


        paramMap.put("offset", searchOffset);
        paramMap.put("limit", searchLimit);
        paramMap.put("shaIn", shaInSearchCondition);

        int count = shaInService.searchCount(shaInSearchCondition);
        List<ShaInDataBase> shaInDataBases = shaInService.getShaIns(paramMap);

        shaInSearchResult.setCount(count);
        shaInSearchResult.setData(shaInDataBases);


        return shaInSearchResult;
    }

    // 社員一覧画面 ポップアップモード
    @GetMapping("/list-popup")
    public String showShaInListPopup(Model model, HttpServletResponse response) {

        // キャッシュ禁用
        userTools.disableCache(response);

        //  1ページあたりに表示するアイテム数
        itemsPerPage = 5;
        model.addAttribute("pageCount", itemsPerPage);

        // shaInSearch 検索条件のモデル
        // shaInModel 検索データのモデル
        model.addAttribute("shaInSearch", new ShaIn());
        model.addAttribute("shaInModel", new ShaInDataBase());

        // ポップアップモード　表示
        model.addAttribute("mode", "popup");

        return "shainlist";
    }

}
