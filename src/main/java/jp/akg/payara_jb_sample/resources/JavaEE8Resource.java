package jp.akg.payara_jb_sample.resources;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import java.util.Properties;
import javax.batch.operations.JobOperator;
import javax.batch.runtime.BatchRuntime;
import javax.ejb.Stateless;
import javax.ws.rs.QueryParam;

/**
 *
 * @author 
 */
@Path("/javaee8")
public class JavaEE8Resource{
    
    
    @GET
    @Path("/start")
    public Response ping(@QueryParam("a") String a){
        
        JobOperator jobOperator = BatchRuntime.getJobOperator();
        
        try{
         jobOperator.start(a, null);
        }catch(Exception e){
            e.printStackTrace();
        }
         return Response
                .ok("ping")
                .build();
    }
}
