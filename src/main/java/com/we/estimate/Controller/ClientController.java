package com.we.estimate.Controller;

import com.github.pagehelper.PageInfo;
import com.we.estimate.Entity.Busyo;
import com.we.estimate.Entity.Client;
import com.we.estimate.Entity.ShaIn;
import com.we.estimate.Entity.Syain;
import com.we.estimate.Search.ClientSearchResult;
import com.we.estimate.Service.BusyoService;
import com.we.estimate.Service.ClientService;
import com.we.estimate.Service.ShaInService;
import com.we.estimate.Service.SyainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//クライアント一覧画面
@Controller
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @Autowired
    private BusyoService busyoService;

    @Autowired
    private SyainService syainService;

    @GetMapping("/list")
    public String showClientList(Model model){
        model.addAttribute("clientSearch",new Client());
        return "clientfind";
    }



    //クライアント検索
    @PostMapping("/search/clients")
    public String findClients(Model model,@ModelAttribute("clientSearch")Client client,@RequestParam(value = "pageIndex", required = false, defaultValue = "1") Integer pageIndex,
                                          @RequestParam(value = "pageSize", required = false, defaultValue = "3") Integer pageSize){
        System.out.println(pageIndex);
        System.out.println(pageSize);
        System.out.println(client);


        /*Map<String,Object> paramMap = new HashMap<>();
        paramMap.put("offset",pageIndex);
        paramMap.put("limit",pageSize);
        paramMap.put("client",client);*/


        PageInfo<Client> clientPageInfo = clientService.selectByConditions(pageIndex, pageSize, client);

        /*ClientSearchResult clientSearchResult = new ClientSearchResult();
        clientSearchResult.setClients(clients);
        clientSearchResult.setCount(clients.size());*/
        System.out.println(clientPageInfo.toString());
        model.addAttribute("page",clientPageInfo);
        model.addAttribute("path","/search/clients?pageIndex=");


        return "clientfind";

    }

    @GetMapping("/search/busho")
    public String findBushoName(@ModelAttribute("busyoCode") String busyoCode, Model model){
        Busyo busyo = busyoService.selectByBusyoCode(busyoCode);
        model.addAttribute("busho",busyo.getNmBusho()+busyo.getNmBusho2()+busyo.getNmBusho3());
        return "bushoName";

    }

    @GetMapping("/search/shain")
    public String findShain(@ModelAttribute("shainCode") String shainCode,Model model){
        Syain syain = syainService.selectByPrimaryKey(shainCode);
        model.addAttribute("eigyoTanto",syain.getNmShain());

        return "tantoName";
    }
}
