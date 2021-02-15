package com.istl.firemap_api.firemap_api.controller.firework;

import com.istl.firemap_api.firemap_api.bo.Firework;
import com.istl.firemap_api.firemap_api.service.firework.FireworkService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import javax.ws.rs.QueryParam;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FireworkControllerTest {

    @Test
    void fireworkController_shouldBeAnnotated(){
        var controllerAnnotation =
                FireworkControllerImpl.class.getAnnotation(RestController.class);
        Assertions.assertNotNull(controllerAnnotation);
    }

    @Test
    void getFireworks_shouldBeAnnotated() throws NoSuchMethodException {
        var getFireworks =
                FireworkControllerImpl.class.getDeclaredMethod("getAllFirework");
        var getMapping = getFireworks.getAnnotation(GetMapping.class);

        Assertions.assertNotNull(getMapping);
        Assertions.assertArrayEquals(new String[]{"/fireworks"}, getMapping.value());
    }

    @Test
    void newFirework_shouldBeAnnotated() throws NoSuchMethodException {
        var newFirework =
                FireworkControllerImpl.class.getDeclaredMethod("newFirework", Firework.class);
        var postMapping = newFirework.getAnnotation(PostMapping.class);

        var pathVariableAnnotation = newFirework.getParameters()[0].getAnnotation(RequestBody.class);

        Assertions.assertNotNull(postMapping);
        Assertions.assertArrayEquals(new String[]{"/fireworks"}, postMapping.value());

        Assertions.assertNotNull(pathVariableAnnotation);
    }

    @Test
    void getFireworkById_shouldBeAnnotated() throws NoSuchMethodException {
        var getFireworkById =
                FireworkControllerImpl.class.getDeclaredMethod("geFireworkById", Long.class);
        var getMapping = getFireworkById.getAnnotation(GetMapping.class);

        var pathVariableAnnotation = getFireworkById.getParameters()[0].getAnnotation(PathVariable.class);

        Assertions.assertNotNull(getMapping);
        Assertions.assertArrayEquals(new String[]{"/fireworks/{id}"}, getMapping.value());

        Assertions.assertNotNull(pathVariableAnnotation);
    }



    @Test
    void replaceFirework_shouldBeAnnotated() throws NoSuchMethodException {
        var replaceFirework =
                FireworkControllerImpl.class.getDeclaredMethod("replaceFirework", Long.class, int.class, boolean.class, String.class, String.class);
        var putMapping = replaceFirework.getAnnotation(PutMapping.class);

        var pathVariableAnnotation1 = replaceFirework.getParameters()[0].getAnnotation(PathVariable.class);
        var pathVariableAnnotation2 = replaceFirework.getParameters()[1].getAnnotation(QueryParam.class);
        var pathVariableAnnotation3 = replaceFirework.getParameters()[2].getAnnotation(QueryParam.class);
        var pathVariableAnnotation4 = replaceFirework.getParameters()[3].getAnnotation(QueryParam.class);
        var pathVariableAnnotation5 = replaceFirework.getParameters()[4].getAnnotation(QueryParam.class);

        Assertions.assertNotNull(putMapping);
        Assertions.assertArrayEquals(new String[]{"/fireworks/{id}"}, putMapping.value());

        Assertions.assertNotNull(pathVariableAnnotation1);
        Assertions.assertNotNull(pathVariableAnnotation2);
        Assertions.assertNotNull(pathVariableAnnotation3);
        Assertions.assertNotNull(pathVariableAnnotation4);
        Assertions.assertNotNull(pathVariableAnnotation5);
    }



    @Test
    void getFireworks_shouldCallTheService(){
        var service = Mockito.mock(FireworkService.class);
        var controller = new FireworkControllerImpl(service);

        Firework firework1 = new Firework();
        firework1.setAddress("gotham city");
        List<Firework> fireworkList1 = new ArrayList<>();
        fireworkList1.add(firework1);
        Mockito.when(service.getAllFirework()).thenReturn(fireworkList1);

        List<Firework> fireworkList2 = controller.getAllFirework();
        Firework firework2 = fireworkList2.get(0);
        Assertions.assertEquals("gotham city", firework2.getAddress());

        Mockito.verify(service).getAllFirework();
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

}
