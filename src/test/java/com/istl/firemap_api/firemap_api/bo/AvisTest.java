package com.istl.firemap_api.firemap_api.bo;

import org.junit.jupiter.api.Test;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AvisTest {

    @Test
    void avis_shouldBeAnEmbeddable(){
        assertNotNull(Avis.class.getAnnotation(Embeddable.class));
    }

}
