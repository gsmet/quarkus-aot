package fr.spacefox.perftests.quarkus.rest.endpoint390;

import fr.spacefox.perftests.quarkus.core.service390.Service390;
import fr.spacefox.perftests.quarkus.rest.endpoint390.schema.Schema390;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint390")
public class Endpoint390Resource {

    private final Service390 service;

    public Endpoint390Resource(Service390 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema390 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
