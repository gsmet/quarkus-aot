package fr.spacefox.perftests.quarkus.rest.endpoint798;

import fr.spacefox.perftests.quarkus.core.service798.Service798;
import fr.spacefox.perftests.quarkus.rest.endpoint798.schema.Schema798;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint798")
public class Endpoint798Resource {

    private final Service798 service;

    public Endpoint798Resource(Service798 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema798 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
