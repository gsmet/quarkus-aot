package fr.spacefox.perftests.quarkus.rest.endpoint805;

import fr.spacefox.perftests.quarkus.core.service805.Service805;
import fr.spacefox.perftests.quarkus.rest.endpoint805.schema.Schema805;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint805")
public class Endpoint805Resource {

    private final Service805 service;

    public Endpoint805Resource(Service805 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema805 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
