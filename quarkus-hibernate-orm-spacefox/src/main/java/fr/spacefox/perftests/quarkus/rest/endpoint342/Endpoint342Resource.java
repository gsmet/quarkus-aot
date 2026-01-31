package fr.spacefox.perftests.quarkus.rest.endpoint342;

import fr.spacefox.perftests.quarkus.core.service342.Service342;
import fr.spacefox.perftests.quarkus.rest.endpoint342.schema.Schema342;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint342")
public class Endpoint342Resource {

    private final Service342 service;

    public Endpoint342Resource(Service342 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema342 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
