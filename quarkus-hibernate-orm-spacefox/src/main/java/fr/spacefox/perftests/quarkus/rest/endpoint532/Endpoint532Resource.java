package fr.spacefox.perftests.quarkus.rest.endpoint532;

import fr.spacefox.perftests.quarkus.core.service532.Service532;
import fr.spacefox.perftests.quarkus.rest.endpoint532.schema.Schema532;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint532")
public class Endpoint532Resource {

    private final Service532 service;

    public Endpoint532Resource(Service532 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema532 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
