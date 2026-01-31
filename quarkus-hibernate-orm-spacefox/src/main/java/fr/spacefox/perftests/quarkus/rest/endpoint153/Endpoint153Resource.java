package fr.spacefox.perftests.quarkus.rest.endpoint153;

import fr.spacefox.perftests.quarkus.core.service153.Service153;
import fr.spacefox.perftests.quarkus.rest.endpoint153.schema.Schema153;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint153")
public class Endpoint153Resource {

    private final Service153 service;

    public Endpoint153Resource(Service153 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema153 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
