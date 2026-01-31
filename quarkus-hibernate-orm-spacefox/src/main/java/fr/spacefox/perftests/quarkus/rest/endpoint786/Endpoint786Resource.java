package fr.spacefox.perftests.quarkus.rest.endpoint786;

import fr.spacefox.perftests.quarkus.core.service786.Service786;
import fr.spacefox.perftests.quarkus.rest.endpoint786.schema.Schema786;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint786")
public class Endpoint786Resource {

    private final Service786 service;

    public Endpoint786Resource(Service786 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema786 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
