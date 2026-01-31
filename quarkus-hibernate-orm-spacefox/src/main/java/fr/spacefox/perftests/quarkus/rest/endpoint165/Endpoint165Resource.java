package fr.spacefox.perftests.quarkus.rest.endpoint165;

import fr.spacefox.perftests.quarkus.core.service165.Service165;
import fr.spacefox.perftests.quarkus.rest.endpoint165.schema.Schema165;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint165")
public class Endpoint165Resource {

    private final Service165 service;

    public Endpoint165Resource(Service165 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema165 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
