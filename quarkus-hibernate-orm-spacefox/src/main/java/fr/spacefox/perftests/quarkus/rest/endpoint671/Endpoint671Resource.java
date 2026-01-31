package fr.spacefox.perftests.quarkus.rest.endpoint671;

import fr.spacefox.perftests.quarkus.core.service671.Service671;
import fr.spacefox.perftests.quarkus.rest.endpoint671.schema.Schema671;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint671")
public class Endpoint671Resource {

    private final Service671 service;

    public Endpoint671Resource(Service671 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema671 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
