package fr.spacefox.perftests.quarkus.rest.endpoint597;

import fr.spacefox.perftests.quarkus.core.service597.Service597;
import fr.spacefox.perftests.quarkus.rest.endpoint597.schema.Schema597;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint597")
public class Endpoint597Resource {

    private final Service597 service;

    public Endpoint597Resource(Service597 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema597 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
