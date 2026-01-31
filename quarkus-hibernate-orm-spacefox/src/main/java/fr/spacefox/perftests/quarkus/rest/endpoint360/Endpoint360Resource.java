package fr.spacefox.perftests.quarkus.rest.endpoint360;

import fr.spacefox.perftests.quarkus.core.service360.Service360;
import fr.spacefox.perftests.quarkus.rest.endpoint360.schema.Schema360;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint360")
public class Endpoint360Resource {

    private final Service360 service;

    public Endpoint360Resource(Service360 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema360 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
