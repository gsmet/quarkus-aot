package fr.spacefox.perftests.quarkus.rest.endpoint170;

import fr.spacefox.perftests.quarkus.core.service170.Service170;
import fr.spacefox.perftests.quarkus.rest.endpoint170.schema.Schema170;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint170")
public class Endpoint170Resource {

    private final Service170 service;

    public Endpoint170Resource(Service170 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema170 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
