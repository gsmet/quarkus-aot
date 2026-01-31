package fr.spacefox.perftests.quarkus.rest.endpoint744;

import fr.spacefox.perftests.quarkus.core.service744.Service744;
import fr.spacefox.perftests.quarkus.rest.endpoint744.schema.Schema744;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint744")
public class Endpoint744Resource {

    private final Service744 service;

    public Endpoint744Resource(Service744 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema744 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
