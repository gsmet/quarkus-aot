package fr.spacefox.perftests.quarkus.rest.endpoint903;

import fr.spacefox.perftests.quarkus.core.service903.Service903;
import fr.spacefox.perftests.quarkus.rest.endpoint903.schema.Schema903;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint903")
public class Endpoint903Resource {

    private final Service903 service;

    public Endpoint903Resource(Service903 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema903 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
