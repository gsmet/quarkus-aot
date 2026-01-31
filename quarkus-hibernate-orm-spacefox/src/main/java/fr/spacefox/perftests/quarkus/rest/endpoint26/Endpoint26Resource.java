package fr.spacefox.perftests.quarkus.rest.endpoint26;

import fr.spacefox.perftests.quarkus.core.service26.Service26;
import fr.spacefox.perftests.quarkus.rest.endpoint26.schema.Schema26;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint26")
public class Endpoint26Resource {

    private final Service26 service;

    public Endpoint26Resource(Service26 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema26 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
