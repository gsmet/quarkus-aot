package fr.spacefox.perftests.quarkus.rest.endpoint299;

import fr.spacefox.perftests.quarkus.core.service299.Service299;
import fr.spacefox.perftests.quarkus.rest.endpoint299.schema.Schema299;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint299")
public class Endpoint299Resource {

    private final Service299 service;

    public Endpoint299Resource(Service299 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema299 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
