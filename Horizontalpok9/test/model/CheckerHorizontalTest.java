/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author macbook
 */
public class CheckerHorizontalTest {
    
    @Test
    public void checkHorizontalTestIsTrue() {
       xoModel xs = new xoModel();
       xs.setArrayOfBoard(0,2);
       xs.setArrayOfBoard(1,2);
       xs.setArrayOfBoard(2,2);
       assertEquals(true, xs.checkHorizontal(2));
    
    }
    @Test
    public void checkHorizontalTestIsFalse(){
         xoModel xs = new xoModel();
       xs.setArrayOfBoard(0,2);
       xs.setArrayOfBoard(8,2);
       xs.setArrayOfBoard(2,2);
       assertEquals(false, xs.checkHorizontal(2));
    }
    
    
}
