package fr.spacefox.perftests.quarkus.rest.endpoint761;

import fr.spacefox.perftests.quarkus.core.service761.Service761;
import fr.spacefox.perftests.quarkus.rest.endpoint761.schema.Schema761;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint761")
public class Endpoint761Resource {

    private final Service761 service;

    public Endpoint761Resource(Service761 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema761 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
