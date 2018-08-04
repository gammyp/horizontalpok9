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
    
    @Test
    public void checkDiagonalIsWin() {
       xoModel xs = new xoModel();
       xs.checkDiagoanl();
        for(int i=0; i<9;i++){
            System.out.println(xs.getArrayOfBoard()[i]);
        }
       
        assertEquals(false, xs.checkDiagoanl());
    }
}
