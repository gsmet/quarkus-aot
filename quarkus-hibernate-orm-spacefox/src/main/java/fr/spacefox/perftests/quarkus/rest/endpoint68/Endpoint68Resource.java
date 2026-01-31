package fr.spacefox.perftests.quarkus.rest.endpoint68;

import fr.spacefox.perftests.quarkus.core.service68.Service68;
import fr.spacefox.perftests.quarkus.rest.endpoint68.schema.Schema68;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint68")
public class Endpoint68Resource {

    private final Service68 service;

    public Endpoint68Resource(Service68 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema68 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
