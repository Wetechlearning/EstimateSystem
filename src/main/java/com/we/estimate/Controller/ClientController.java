package com.we.estimate.Controller;

import com.github.pagehelper.PageInfo;
import com.we.estimate.Entity.*;
import com.we.estimate.Search.ClientShosai;
import com.we.estimate.Search.ClientVo;
import com.we.estimate.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//クライアント一覧画面
@Controller
public class ClientController {

    @Autowired
    private ClientService clientService;

    @Autowired
    private BusyoService busyoService;

    @Autowired
    private SyainService syainService;

    @Autowired
    private McTm010Service mcTm010Service;

    @Autowired
    private GyosyuService gyosyuService;

    @Autowired
    private McTm120Service mcTm120Service;

    @Autowired
    private McTm130Service mcTm130Service;

    @Autowired
    private McVm042Service mcVm042Service;

    @GetMapping("/getlist")
    public String showClientList(Model model){
        model.addAttribute("clientSearch",new Client());
        return "clientfind.html";
    }



    //クライアント検索
    @GetMapping("/search/clients")
    public String findClients(Model model,@ModelAttribute("clientSearch")Client client,@RequestParam(value = "pageIndex", required = false, defaultValue = "1") Integer pageIndex,
                                          @RequestParam(value = "pageSize", required = false, defaultValue = "2") Integer pageSize,
                                          @RequestParam(value = "nmClient",required = false)String nmClientPage,
                              @RequestParam(value = "fgJiko",required = false)String fgJikoPage){
        System.out.println(pageIndex);
        System.out.println(pageSize);
        System.out.println(client);




        /*Map<String,Object> paramMap = new HashMap<>();
        paramMap.put("offset",pageIndex);
        paramMap.put("limit",pageSize);
        paramMap.put("client",client);*/
        ClientVo clientVo = new ClientVo();
        if (client.getNmClient()!=null){
            if (client.getNmClient()!=""){
                client.setNmClient(String.format("%-60s",client.getNmClient()));
            }



            clientVo.setClient(client);
            model.addAttribute("clientSearch",client);

            PageInfo<Client> clientPageInfo = clientService.selectByConditions(pageIndex, pageSize, clientVo);

        /*ClientSearchResult clientSearchResult = new ClientSearchResult();
        clientSearchResult.setClients(clients);
        clientSearchResult.setCount(clients.size());*/
            //System.out.println(clientPageInfo);
        /*if (client.getCdEigyoBusho()!=null){
            System.out.println(client.getCdEigyoBusho());
            Busyo busyo = busyoService.selectByBusyoCode(client.getCdEigyoBusho());
            model.addAttribute("nmBusho",busyo.getNmBusho().trim()+busyo.getNmBusho2().trim()+busyo.getNmBusho3().trim());
        }*/




            System.out.println(clientPageInfo.getList());
            model.addAttribute("clientList",clientPageInfo.getList());
            model.addAttribute("page",clientPageInfo);
            model.addAttribute("path","/search/clients?pageIndex=");


            return "clientfind";
        }else {
            /*client.setNmClient(nmClientPage);
            client.setFgJiko(fgJikoPage);
            clientVo.setClient(client);
            model.addAttribute("clientSearch",client);*/
            return "clientfind";
        }




    }

    @GetMapping("/search/clientBusho")
    @ResponseBody
    public String findBushoName(@RequestParam("bushoCode") String bushoCode, Model model){
        System.out.println(bushoCode);
        Busyo busyo = busyoService.selectByBusyoCode(bushoCode);
        model.addAttribute("nmBusho",busyo.getNmBusho()+busyo.getNmBusho2()+busyo.getNmBusho3());
        return busyo.getNmBusho().trim()+busyo.getNmBusho2().trim()+busyo.getNmBusho3().trim();

    }

    @GetMapping("/search/clientShain")
    @ResponseBody
    public String findShain(@RequestParam("shainCode") String shainCode,Model model){
        System.out.println(shainCode);
        Syain syain = syainService.selectByPrimaryKey(shainCode);
        model.addAttribute("eigyoTanto",syain.getNmShain());
        return syain.getNmShain().trim();
    }

    @RequestMapping("/search/client")
    public String findClient(Model model, @RequestParam(value = "clientCode",required = false)String clientCode, HttpServletRequest request, HttpServletResponse response)throws Exception{
        System.out.println(clientCode);
        if (clientCode!=null){
            ClientShosai clientShosai = new ClientShosai();
            McTm010 mcTm010 = mcTm010Service.selectByClientCode(Integer.parseInt(clientCode));
            //Client client = clientService.selectByPrimaryKey(Integer.valueOf(clientCode));
            Gyosyu gyosyu = gyosyuService.selectByPrimaryKey(mcTm010.getCdGyoshu());
            String nmGyosyu = gyosyu.getNmGyoshu();

            Syain syainDairi = syainService.selectByPrimaryKey(mcTm010.getCdShainDairiten());
            String nmShainDairiten = syainDairi.getNmShain();

            Syain syainEigyo = syainService.selectByPrimaryKey(mcTm010.getCdEigyoTanto());
            String nmEigyoTanto = syainEigyo.getNmShain();

            Busyo busyo = busyoService.selectByBusyoCode(mcTm010.getCdEigyoBusho());
            String nmEigyoBusyo = busyo.getNmBusho()+busyo.getNmBusho2()+busyo.getNmBusho3();

            /*McTm120 mcTm120 = mcTm120Service.selectByPrimaryKey(mcTm010.getCdFurikomiKoza());
            String noKozaVirtual = mcTm120.getNoKoza();*/
            //String nmKozaVirtual = mcTm120.getNmKoza();

            /*McTm130 mcTm130 = mcTm130Service.selectByNmKoza(nmKozaVirtual);
            String cdGinkoVirtual = mcTm130.getCdGinkoVirtual();
            String cdShitenVirtual = mcTm130.getCdShitenVirtual();*/

            McVm042 mcVm042 = mcVm042Service.selectByNmGinkoShitenVirtual(mcTm010.getCdGinkoVirtual(),mcTm010.getCdShitenVirtual());
            String nmGinkoShitenVirtual = mcVm042.getNmGinkoShitenVirtual();

            clientShosai.setMcTm010(mcTm010);
            clientShosai.setNmGyoshu(nmGyosyu);
            clientShosai.setNmEigyoTanto(nmEigyoTanto);
            clientShosai.setNmEigyoBusho(nmEigyoBusyo);
            clientShosai.setNmShainDairiten(nmShainDairiten);
            //clientShosai.setNoKozaVirtual(noKozaVirtual);
            clientShosai.setNmGinkoShitenVirtual(nmGinkoShitenVirtual);

            model.addAttribute("clientShosai",clientShosai);

        }

        return "clientsheet";
    }
}
