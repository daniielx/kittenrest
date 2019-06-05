package com.draco;



import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("kittens")
public class KittenResource {

    private KittenRepository repo = new KittenRepository();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Kitten> getKitten(){
        return repo.getKittens();
    }

    @POST
    @Path("kitten")
    @Consumes(MediaType.APPLICATION_JSON)
    public Kitten createKitten(Kitten kt){
        System.out.println(kt);
        repo.create(kt);
        return kt;
    }
}
