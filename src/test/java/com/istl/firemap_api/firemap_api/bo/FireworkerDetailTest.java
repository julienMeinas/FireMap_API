package com.istl.firemap_api.firemap_api.bo;

import org.junit.jupiter.api.Test;

import javax.persistence.*;

import static org.junit.jupiter.api.Assertions.*;

public class FireworkerDetailTest {

    @Test
    void fireworkerDetail_shouldBeAnEntity(){
        assertNotNull(FireworkerDetail.class.getAnnotation(Entity.class));
    }

    @Test
    void fireworkerDetailId_shouldBeAnId() throws NoSuchFieldException {
        assertNotNull(FireworkerDetail.class.getDeclaredField("id").getAnnotation(Id.class));
    }

    @Test
    void fireworkerDetailAvis_shouldBeAnElementCollection() throws NoSuchFieldException {
        assertNotNull(FireworkerDetail.class.getDeclaredField("avis").getAnnotation(ElementCollection.class));
    }

    @Test
    void fireworkerDetailImages_shouldBeAnElementCollection() throws NoSuchFieldException {
        assertNotNull(FireworkerDetail.class.getDeclaredField("images").getAnnotation(ElementCollection.class));
    }
}
