package fr.spacefox.perftests.quarkus.rest.endpoint470;

import fr.spacefox.perftests.quarkus.core.service470.Service470;
import fr.spacefox.perftests.quarkus.rest.endpoint470.schema.Schema470;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint470")
public class Endpoint470Resource {

    private final Service470 service;

    public Endpoint470Resource(Service470 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema470 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
