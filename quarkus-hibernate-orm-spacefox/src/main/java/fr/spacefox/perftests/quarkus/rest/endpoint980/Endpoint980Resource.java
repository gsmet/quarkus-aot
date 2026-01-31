package fr.spacefox.perftests.quarkus.rest.endpoint980;

import fr.spacefox.perftests.quarkus.core.service980.Service980;
import fr.spacefox.perftests.quarkus.rest.endpoint980.schema.Schema980;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint980")
public class Endpoint980Resource {

    private final Service980 service;

    public Endpoint980Resource(Service980 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema980 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
