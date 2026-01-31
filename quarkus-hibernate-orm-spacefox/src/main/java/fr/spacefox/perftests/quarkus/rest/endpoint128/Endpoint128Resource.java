package fr.spacefox.perftests.quarkus.rest.endpoint128;

import fr.spacefox.perftests.quarkus.core.service128.Service128;
import fr.spacefox.perftests.quarkus.rest.endpoint128.schema.Schema128;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint128")
public class Endpoint128Resource {

    private final Service128 service;

    public Endpoint128Resource(Service128 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema128 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
