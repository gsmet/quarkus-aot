package fr.spacefox.perftests.quarkus.rest.endpoint819;

import fr.spacefox.perftests.quarkus.core.service819.Service819;
import fr.spacefox.perftests.quarkus.rest.endpoint819.schema.Schema819;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint819")
public class Endpoint819Resource {

    private final Service819 service;

    public Endpoint819Resource(Service819 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema819 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
