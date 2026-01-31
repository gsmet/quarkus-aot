package fr.spacefox.perftests.quarkus.rest.endpoint825;

import fr.spacefox.perftests.quarkus.core.service825.Service825;
import fr.spacefox.perftests.quarkus.rest.endpoint825.schema.Schema825;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint825")
public class Endpoint825Resource {

    private final Service825 service;

    public Endpoint825Resource(Service825 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema825 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
