package fr.spacefox.perftests.quarkus.rest.endpoint321;

import fr.spacefox.perftests.quarkus.core.service321.Service321;
import fr.spacefox.perftests.quarkus.rest.endpoint321.schema.Schema321;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint321")
public class Endpoint321Resource {

    private final Service321 service;

    public Endpoint321Resource(Service321 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema321 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
