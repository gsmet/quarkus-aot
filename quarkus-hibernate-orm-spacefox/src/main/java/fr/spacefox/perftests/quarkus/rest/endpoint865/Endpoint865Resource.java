package fr.spacefox.perftests.quarkus.rest.endpoint865;

import fr.spacefox.perftests.quarkus.core.service865.Service865;
import fr.spacefox.perftests.quarkus.rest.endpoint865.schema.Schema865;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint865")
public class Endpoint865Resource {

    private final Service865 service;

    public Endpoint865Resource(Service865 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema865 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
