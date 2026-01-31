package fr.spacefox.perftests.quarkus.rest.endpoint228;

import fr.spacefox.perftests.quarkus.core.service228.Service228;
import fr.spacefox.perftests.quarkus.rest.endpoint228.schema.Schema228;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint228")
public class Endpoint228Resource {

    private final Service228 service;

    public Endpoint228Resource(Service228 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema228 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
