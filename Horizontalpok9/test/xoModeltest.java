/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.naming.spi.DirStateFactory;
import javax.naming.spi.DirStateFactory.Result;
import model.xoModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Game
 */
public class xoModeltest {
    
    xoModel xoModel = new xoModel();
    
    @Test
    public void testUserModel() {
        //try to get player 1 and 2.
        assertEquals("Player1", xoModel.getPlayer1());
        assertEquals("Player2", xoModel.getPlayer2());
        //try to insert value to array.
        xoModel.insertValueToArray(1, 2);
        xoModel.insertValueToArray(1, 1);
        xoModel.insertValueToArray(2, 1);
        //try to return value from array by method.
        assertEquals(xoModel.getArrayOfBoard()[1], 2);
        assertEquals(xoModel.getArrayOfBoard()[2], 1);
    }
    
    public void เทสฟังก์ชั่นชื่อcheckDiagonalIsWinต้องได้False() {
       xoModel xs = new xoModel();
       
        assertEquals(false, xs.checkDiagoanl(1));
    }
    @Test
    public void เทสฟังก์ชั่นชื่อcheckDiagonalIsWinต้องได้True() {
       xoModel xs = new xoModel();
       xs.setArrayOfBoard(0,1);
       xs.setArrayOfBoard(4,1);
       xs.setArrayOfBoard(8,1);
        assertEquals(true, xs.checkDiagoanl(1));
    }
    
    
}
