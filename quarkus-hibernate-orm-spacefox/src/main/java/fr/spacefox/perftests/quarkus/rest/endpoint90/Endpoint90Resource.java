package fr.spacefox.perftests.quarkus.rest.endpoint90;

import fr.spacefox.perftests.quarkus.core.service90.Service90;
import fr.spacefox.perftests.quarkus.rest.endpoint90.schema.Schema90;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint90")
public class Endpoint90Resource {

    private final Service90 service;

    public Endpoint90Resource(Service90 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema90 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
