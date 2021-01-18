package com.istl.firemap_api.firemap_api.controller.fireworker;


import com.istl.firemap_api.firemap_api.bo.Firework;
import com.istl.firemap_api.firemap_api.bo.Fireworker;
import com.istl.firemap_api.firemap_api.bo.FireworkerDetail;
import com.istl.firemap_api.firemap_api.controller.firework.FireworkController;
import com.istl.firemap_api.firemap_api.controller.firework.FireworkControllerImpl;
import com.istl.firemap_api.firemap_api.service.firework.FireworkService;
import com.istl.firemap_api.firemap_api.service.fireworker.FireworkerService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FireworkerControllerTest {
    @Test
    void getFireworkers_shouldCallTheService(){
        var service = Mockito.mock(FireworkerService.class);
        var controller = new FireworkerControllerImpl(service);

        FireworkerDetail fireworker1 = new FireworkerDetail();
        fireworker1.setName("Tarby");
        List<FireworkerDetail> fireworkerList1 = new ArrayList<>();
        fireworkerList1.add(fireworker1);
        Mockito.when(service.getFireworkers()).thenReturn(fireworkerList1);

        List<FireworkerDetail> fireworkerList2 = controller.getFireworkers();
        FireworkerDetail fireworker2 = fireworkerList2.get(0);
        Assertions.assertEquals("Tarby", fireworker2.getName());

        Mockito.verify(service).getFireworkers();
    }

    @Test
    void newFireworker_shouldCallTheService(){
        var service = Mockito.mock(FireworkerService.class);
        var controller = new FireworkerControllerImpl(service);

        FireworkerDetail fireworker1 = new FireworkerDetail();
        fireworker1.setName("Tarby");
        Mockito.when(service.newFireworker(null)).thenReturn(fireworker1);

        Assertions.assertEquals("Tarby", controller.newFireworker(null).getName());

        Mockito.verify(service).newFireworker(null);
    }

    @Test
    void geFireworkerById_shouldCallTheService(){
        var service = Mockito.mock(FireworkerService.class);
        var controller = new FireworkerControllerImpl(service);

        FireworkerDetail fireworker1 = new FireworkerDetail();
        fireworker1.setName("Tarby");
        Mockito.when(service.geFireworkerById(42l)).thenReturn(Optional.of(fireworker1));

        Assertions.assertEquals("Tarby", controller.geFireworkerById(42l).get().getName());

        Mockito.verify(service).geFireworkerById(42l);
    }
}
