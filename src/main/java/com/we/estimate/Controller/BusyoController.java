package com.we.estimate.Controller;

import com.github.pagehelper.PageInfo;
import com.we.estimate.Entity.Busyo;
import com.we.estimate.Search.BusyoShosai;
import com.we.estimate.Search.BusyoVo;
import com.we.estimate.Search.Params;
import com.we.estimate.Service.BusyoService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BusyoController {

    @Autowired
    private BusyoService busyoService;


    @RequestMapping(value = "search/busyos")
    public String findBusyos(Model model, @RequestParam(value = "pageIndex", required = false, defaultValue = "1") Integer pageIndex,
                             @RequestParam(value = "pageSize", required = false, defaultValue = "2") Integer pageSize,
                             @RequestBody(required = false) Params params) {

        System.out.println("进入search/busyos方法");
        System.out.println(pageIndex);
        System.out.println(pageSize);

        /*if (busyo != null) {
            if (busyo.getNmBusho() != null ||
                    busyo.getCdBusho() != null ||
                    busyo.getCdKaisha() != null ||
                    busyo.getCdJigyoMc5() != null ||
                    busyo.getKbBushoMc5() != null ||
                    busyo.getFgDelete() != null ||
                    busyo.getKbBusho() != null) {
                if (!busyo.getNmBusho().isEmpty()) {
                    busyo.setNmBusho(String.format("%-8s", busyo.getNmBusho()));
                }

                busyo.setCdJigyoMc5(String.format("%-10s", busyo.getCdJigyoMc5()));
                BusyoVo busyoVo = new BusyoVo();
                busyoVo.setBusyo(busyo);
                //model.addAttribute("busyoSearch", busyo);

                PageInfo<Busyo> busyoPageInfo = busyoService.selectByConditions(pageIndex, pageSize, busyoVo);
                List<Busyo> busyoList = busyoService.selectByConditionsList(busyoVo);

                System.out.println("busyoPageInfo:" + busyoPageInfo);
                model.addAttribute("busyoList", busyoPageInfo.getList());
                model.addAttribute("busyoList1", busyoList);
                model.addAttribute("page", busyoPageInfo);
                model.addAttribute("path", "/search/busyos?pageIndex=");

                return "busyofind::resultFragment";
            } else {

                return "busyofind";
            }

        }*/
        if (params!=null){
            if (params.getBusyo()!=null){
                System.out.println("params<busyo"+params.getBusyo());

            if (params.getBusyo().getNmBusho()!=null&&params.getBusyo().getNmBusho()!=""){
                params.getBusyo().setNmBusho(String.format("%-8s", params.getBusyo().getNmBusho()));
            }

            params.getBusyo().setCdJigyoMc5(String.format("%-10s", params.getBusyo().getCdJigyoMc5()));
            BusyoVo busyoVo = new BusyoVo();
            busyoVo.setBusyo(params.getBusyo());
            PageInfo<Busyo> busyoPageInfo = busyoService.selectByConditions(pageIndex, pageSize, busyoVo);
            List<Busyo> busyoList = busyoService.selectByConditionsList(busyoVo);


            System.out.println("busyoPageInfo:" + busyoPageInfo);
            model.addAttribute("busyoList", busyoPageInfo.getList());
            model.addAttribute("busyoList1", busyoList);
            model.addAttribute("page", busyoPageInfo);
            model.addAttribute("path", "/search/busyos?pageIndex=");

            return "busyofind::resultFragment";
            }else if (params.getCdBushoList()!=null){
                System.out.println("进入List方法");
                PageInfo<Busyo> busyoPageInfo1 = busyoService.selectByIds(pageIndex,pageSize,params.getCdBushoList());
                model.addAttribute("busyoPageInfo1",busyoPageInfo1);
                System.out.println("busyoPageInfo1"+busyoPageInfo1);
                return "busyofind::resultFragmentPage";
            }
        }
        return "busyofind";

    }

    @RequestMapping("/search/busyo")
    public String findBusyo(Model model,@RequestParam(value = "bushoCode",required = false)String bushoCode){
        System.out.println("查询单个busho的详细信息，bushoid："+bushoCode);
        if (bushoCode!=null){
            BusyoShosai busyoShosai = new BusyoShosai();
            Busyo busyo = busyoService.selectByBusyoCode(bushoCode);
            busyoShosai.setBusyo(busyo);
            model.addAttribute("busyoShosai",busyoShosai);
            return "busyosheet";
        }
        return "busyosheet";
    }
}
