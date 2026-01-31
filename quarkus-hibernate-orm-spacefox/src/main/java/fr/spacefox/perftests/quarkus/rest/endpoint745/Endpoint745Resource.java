package fr.spacefox.perftests.quarkus.rest.endpoint745;

import fr.spacefox.perftests.quarkus.core.service745.Service745;
import fr.spacefox.perftests.quarkus.rest.endpoint745.schema.Schema745;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint745")
public class Endpoint745Resource {

    private final Service745 service;

    public Endpoint745Resource(Service745 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema745 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
