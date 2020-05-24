/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.akg.payara_jb_sample.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author takahiro
 */
@Path("JBatchCounter")
public class JBatchCounterResource {
    
    @GET
    public String hellowWorld(){
        return "Hellow World!!";
    }
}
