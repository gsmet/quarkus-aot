package fr.spacefox.perftests.quarkus.rest.endpoint658;

import fr.spacefox.perftests.quarkus.core.service658.Service658;
import fr.spacefox.perftests.quarkus.rest.endpoint658.schema.Schema658;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint658")
public class Endpoint658Resource {

    private final Service658 service;

    public Endpoint658Resource(Service658 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema658 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
