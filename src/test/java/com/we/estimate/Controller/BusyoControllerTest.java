package com.we.estimate.Controller;

import com.we.estimate.Entity.Busyo;
import com.we.estimate.Search.Params;
import com.we.estimate.Service.BusyoService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.ui.Model;
import uk.co.jemos.podam.api.PodamFactoryImpl;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
public class BusyoControllerTest {
    @Autowired
    private BusyoController busyoController;
    @Mock
    Model model;


    @Test
    void findBusyosTest1(){

        Busyo busyo = new Busyo();
        busyo.setCdKaisha("1001");
        busyo.setCdBusho("111");
        Params params = new Params();
        params.setBusyo(busyo);
        System.out.println(busyo);


        String result = busyoController.findBusyos(model,1,2,params);
        System.out.println(result);
    }

    @Test
    void findBusyoTest1(){
        String result = busyoController.findBusyo(model,"111");
        System.out.println(result);
    }
}
