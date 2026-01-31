package fr.spacefox.perftests.quarkus.rest.endpoint222;

import fr.spacefox.perftests.quarkus.core.service222.Service222;
import fr.spacefox.perftests.quarkus.rest.endpoint222.schema.Schema222;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint222")
public class Endpoint222Resource {

    private final Service222 service;

    public Endpoint222Resource(Service222 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema222 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
