/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.akg.payara_jb_sample.batch.batchlet;

import java.util.stream.IntStream;
import javax.batch.api.Batchlet;
import javax.enterprise.context.Dependent;
import javax.inject.Named;


/**
 *
 * @author takahiro
 */
@Dependent
@Named("BatchletCounter")
public class BatchletCounter implements Batchlet{

    @Override
    public String process() throws Exception {
        IntStream.rangeClosed(0, 10).forEach(i -> System.out.println(i));
        
        return "Complete";
        
    }

    @Override
    public void stop() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
