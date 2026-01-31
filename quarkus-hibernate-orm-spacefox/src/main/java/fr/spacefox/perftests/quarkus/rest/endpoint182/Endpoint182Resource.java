package fr.spacefox.perftests.quarkus.rest.endpoint182;

import fr.spacefox.perftests.quarkus.core.service182.Service182;
import fr.spacefox.perftests.quarkus.rest.endpoint182.schema.Schema182;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint182")
public class Endpoint182Resource {

    private final Service182 service;

    public Endpoint182Resource(Service182 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema182 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
