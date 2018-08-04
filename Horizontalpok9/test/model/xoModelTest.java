/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nam_s
 */
public class xoModelTest {
    

    /**
     * Test of getTurn method, of class xoModel.
     */
    @Test
    public void testGetTurn() {
        xoModel instance = new xoModel();
        int expResult = 0;
        int result = instance.getTurn();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTurn method, of class xoModel.
     */
    @Test
    public void testSetTurn() {
        int turn = 0;
        xoModel instance = new xoModel();
        instance.setTurn(turn);
    }

    /**
     * Test of getTieScore method, of class xoModel.
     */
    @Test
    public void testGetTieScore() {
        xoModel instance = new xoModel();
        int expResult = 0;
        int result = instance.getTieScore();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTieScore method, of class xoModel.
     */
    @Test
    public void testSetTieScore() {
        int tieScore = 0;
        xoModel instance = new xoModel();
        instance.setTieScore(tieScore);
  
    }

    /**
     * Test of getWinScorePlayer1 method, of class xoModel.
     */
    @Test
    public void testGetWinScorePlayer1() {
        xoModel instance = new xoModel();
        int expResult = 0;
        int result = instance.getWinScorePlayer1();
        assertEquals(expResult, result);  
    }

    /**
     * Test of setWinScorePlayer1 method, of class xoModel.
     */
    @Test
    public void testSetWinScorePlayer1() {
        int winScorePlayer1 = 0;
        xoModel instance = new xoModel();
        instance.setWinScorePlayer1(winScorePlayer1);
    }

    /**
     * Test of getWinScorePlayer2 method, of class xoModel.
     */
    @Test
    public void testGetWinScorePlayer2() {
        xoModel instance = new xoModel();
        int expResult = 0;
        int result = instance.getWinScorePlayer2();
        assertEquals(expResult, result);
    }

    /**
     * Test of setWinScorePlayer2 method, of class xoModel.
     */
    @Test
    public void testSetWinScorePlayer2() {
        int winScorePlayer2 = 0;
        xoModel instance = new xoModel();
        instance.setWinScorePlayer2(winScorePlayer2);
      
    }
    
    @Test
    public void checkTurn1ต้องได้1(){  
        int turn=1;
        int expectedOutput=1;
        xoModel instance = new xoModel();
        int output = instance.checkTurn(turn);
        assertEquals(expectedOutput,output);
    }
    
     public void checkTurn2ต้องได้0(){  
        int turn=2;
        int expectedOutput=0;
        xoModel instance = new xoModel();
        int output = instance.checkTurn(turn);
        assertEquals(expectedOutput,output);
    }
     
     public void checkTurn3ต้องได้1(){  
        int turn=3;
        int expectedOutput=1;
        xoModel instance = new xoModel();
        int output = instance.checkTurn(turn);
        assertEquals(expectedOutput,output);
    }
     
      public void checkTurn4ต้องได้0(){  
        int turn=4;
        int expectedOutput=0;
        xoModel instance = new xoModel();
        int output = instance.checkTurn(turn);
        assertEquals(expectedOutput,output);
    }
      
       public void checkTurn5ต้องได้1(){  
        int turn=5;
        int expectedOutput=1;
        xoModel instance = new xoModel();
        int output = instance.checkTurn(turn);
        assertEquals(expectedOutput,output);
    }
     
      public void checkTurn6ต้องได้0(){  
        int turn=6;
        int expectedOutput=0;
        xoModel instance = new xoModel();
        int output = instance.checkTurn(turn);
        assertEquals(expectedOutput,output);
    }
      
    public void checkTurn7ต้องได้1(){  
        int turn=7;
        int expectedOutput=1;
        xoModel instance = new xoModel();
        int output = instance.checkTurn(turn);
        assertEquals(expectedOutput,output);
    }
     
    public void checkTurn8ต้องได้0(){  
        int turn=8;
        int expectedOutput=0;
        xoModel instance = new xoModel();
        int output = instance.checkTurn(turn);
        assertEquals(expectedOutput,output);
    }
    
     public void checkTurn9ต้องได้1(){  
        int turn=9;
        int expectedOutput=1;
        xoModel instance = new xoModel();
        int output = instance.checkTurn(turn);
        assertEquals(expectedOutput,output);
    }
    
    
    
}
