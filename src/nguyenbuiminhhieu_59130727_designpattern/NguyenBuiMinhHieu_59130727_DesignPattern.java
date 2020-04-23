/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyenbuiminhhieu_59130727_designpattern;
import Bai1.Context;
import Bai2.Bai2Main;
import Bai3.Bai3Main;
import java.text.ParseException;

/**
 *
 * @author Nguyen Bui Minh Hieu
 */
public class NguyenBuiMinhHieu_59130727_DesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        //bai 1
        System.out.println("Bài tập 1:");
        Context.main(args);
        //bai 2
        System.out.println("Bài tập 2:");
        Bai2Main.main(args);
        //bai 3
        System.out.println("Bài tập 3:");
        Bai3Main.main(args);
    }
    
}
