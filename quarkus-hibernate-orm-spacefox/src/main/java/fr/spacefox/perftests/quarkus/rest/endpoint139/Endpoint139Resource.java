package fr.spacefox.perftests.quarkus.rest.endpoint139;

import fr.spacefox.perftests.quarkus.core.service139.Service139;
import fr.spacefox.perftests.quarkus.rest.endpoint139.schema.Schema139;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint139")
public class Endpoint139Resource {

    private final Service139 service;

    public Endpoint139Resource(Service139 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema139 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
