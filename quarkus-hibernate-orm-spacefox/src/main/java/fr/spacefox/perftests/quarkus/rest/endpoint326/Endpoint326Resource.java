package fr.spacefox.perftests.quarkus.rest.endpoint326;

import fr.spacefox.perftests.quarkus.core.service326.Service326;
import fr.spacefox.perftests.quarkus.rest.endpoint326.schema.Schema326;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint326")
public class Endpoint326Resource {

    private final Service326 service;

    public Endpoint326Resource(Service326 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema326 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
