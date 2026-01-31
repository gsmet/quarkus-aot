package fr.spacefox.perftests.quarkus.rest.endpoint689;

import fr.spacefox.perftests.quarkus.core.service689.Service689;
import fr.spacefox.perftests.quarkus.rest.endpoint689.schema.Schema689;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint689")
public class Endpoint689Resource {

    private final Service689 service;

    public Endpoint689Resource(Service689 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema689 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
