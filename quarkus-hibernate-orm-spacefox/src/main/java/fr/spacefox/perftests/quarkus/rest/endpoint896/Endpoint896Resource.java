package fr.spacefox.perftests.quarkus.rest.endpoint896;

import fr.spacefox.perftests.quarkus.core.service896.Service896;
import fr.spacefox.perftests.quarkus.rest.endpoint896.schema.Schema896;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint896")
public class Endpoint896Resource {

    private final Service896 service;

    public Endpoint896Resource(Service896 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema896 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
