package com.istl.firemap_api.firemap_api.controller.firework;

import com.istl.firemap_api.firemap_api.bo.Firework;
import com.istl.firemap_api.firemap_api.controller.firework.FireworkController;
import com.istl.firemap_api.firemap_api.controller.firework.FireworkControllerImpl;
import com.istl.firemap_api.firemap_api.service.firework.FireworkService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FireworkControllerTest {
    @Test
    void getFireworks_shouldCallTheService(){
        var service = Mockito.mock(FireworkService.class);
        var controller = new FireworkControllerImpl(service);

        Firework firework1 = new Firework();
        firework1.setAddress("gotham city");
        List<Firework> fireworkList1 = new ArrayList<>();
        fireworkList1.add(firework1);
        Mockito.when(service.getFireworks()).thenReturn(fireworkList1);

        List<Firework> fireworkList2 = controller.getFireworks();
        Firework firework2 = fireworkList2.get(0);
        Assertions.assertEquals("gotham city", firework2.getAddress());

        Mockito.verify(service).getFireworks();
    }

    @Test
    void newFirework_shouldCallTheService(){
        var service = Mockito.mock(FireworkService.class);
        var controller = new FireworkControllerImpl(service);

        Firework firework1 = new Firework();
        firework1.setAddress("gotham city");
        Mockito.when(service.newFirework(null)).thenReturn(firework1);

        Assertions.assertEquals("gotham city", controller.newFirework(null).getAddress());

        Mockito.verify(service).newFirework(null);
    }

    @Test
    void geFireworkById_shouldCallTheService(){
        var service = Mockito.mock(FireworkService.class);
        var controller = new FireworkControllerImpl(service);

        Firework firework1 = new Firework();
        firework1.setAddress("gotham city");
        Mockito.when(service.geFireworkById(42l)).thenReturn(Optional.of(firework1));

        Assertions.assertEquals("gotham city", controller.geFireworkById(42l).get().getAddress());

        Mockito.verify(service).geFireworkById(42l);
    }

    @Test
    void replaceFirework_shouldCallTheService(){
        var service = Mockito.mock(FireworkService.class);
        var controller = new FireworkControllerImpl(service);

        Firework firework1 = new Firework();
        firework1.setAddress("gotham city");
        Mockito.when(service.replaceFirework(null,0,false,null,null)).thenReturn(Optional.of(firework1));

        Assertions.assertEquals("gotham city", controller.replaceFirework(null,0,false,null,null).get().getAddress());

        Mockito.verify(service).replaceFirework(null,0,false,null,null);
    }

    @Test
    void findFireworkByFilter_shouldCallTheService(){
        var service = Mockito.mock(FireworkService.class);
        var controller = new FireworkControllerImpl(service);

        Firework firework1 = new Firework();
        firework1.setAddress("gotham city");
        List<Firework> fireworkList1 = new ArrayList<>();
        fireworkList1.add(firework1);
        Mockito.when(service.findFireworkByFilter(0,null,false,0,null)).thenReturn(fireworkList1);

        List<Firework> fireworkList2 = controller.findFireworkByFilter(0,null,false,0,null);
        Firework firework2 = fireworkList2.get(0);
        Assertions.assertEquals("gotham city", firework2.getAddress());

        Mockito.verify(service).findFireworkByFilter(0,null,false,0,null);
    }
}
