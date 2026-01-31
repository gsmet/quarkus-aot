package fr.spacefox.perftests.quarkus.rest.endpoint685;

import fr.spacefox.perftests.quarkus.core.service685.Service685;
import fr.spacefox.perftests.quarkus.rest.endpoint685.schema.Schema685;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint685")
public class Endpoint685Resource {

    private final Service685 service;

    public Endpoint685Resource(Service685 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema685 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
