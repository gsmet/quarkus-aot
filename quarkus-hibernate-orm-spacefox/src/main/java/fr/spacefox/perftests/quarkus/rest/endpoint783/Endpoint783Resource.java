package fr.spacefox.perftests.quarkus.rest.endpoint783;

import fr.spacefox.perftests.quarkus.core.service783.Service783;
import fr.spacefox.perftests.quarkus.rest.endpoint783.schema.Schema783;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint783")
public class Endpoint783Resource {

    private final Service783 service;

    public Endpoint783Resource(Service783 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema783 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
