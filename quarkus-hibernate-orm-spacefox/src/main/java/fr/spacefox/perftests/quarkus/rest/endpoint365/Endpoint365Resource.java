package fr.spacefox.perftests.quarkus.rest.endpoint365;

import fr.spacefox.perftests.quarkus.core.service365.Service365;
import fr.spacefox.perftests.quarkus.rest.endpoint365.schema.Schema365;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint365")
public class Endpoint365Resource {

    private final Service365 service;

    public Endpoint365Resource(Service365 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema365 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
