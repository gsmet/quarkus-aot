package fr.spacefox.perftests.quarkus.rest.endpoint344;

import fr.spacefox.perftests.quarkus.core.service344.Service344;
import fr.spacefox.perftests.quarkus.rest.endpoint344.schema.Schema344;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint344")
public class Endpoint344Resource {

    private final Service344 service;

    public Endpoint344Resource(Service344 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema344 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
