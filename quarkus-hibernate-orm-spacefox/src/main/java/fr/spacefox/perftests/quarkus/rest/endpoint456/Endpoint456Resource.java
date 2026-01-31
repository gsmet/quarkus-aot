package fr.spacefox.perftests.quarkus.rest.endpoint456;

import fr.spacefox.perftests.quarkus.core.service456.Service456;
import fr.spacefox.perftests.quarkus.rest.endpoint456.schema.Schema456;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint456")
public class Endpoint456Resource {

    private final Service456 service;

    public Endpoint456Resource(Service456 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema456 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
