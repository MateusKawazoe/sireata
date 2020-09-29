/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.dv.sireata.model;

import junit.framework.TestCase;

/**
 *
 * @author Matka
 */
public class CampusTest extends TestCase {
    
    Campus camp;

    @Before
    public void setUp() {
        camp = new Campus();

        camp.setNome("Cornélio Procópio");
    }

    @Test
    public void campusExists() {
        assertEquals("Cornélio Procópio", camp.getNome());
    }
}
