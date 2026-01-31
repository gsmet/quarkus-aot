package fr.spacefox.perftests.quarkus.rest.endpoint104;

import fr.spacefox.perftests.quarkus.core.service104.Service104;
import fr.spacefox.perftests.quarkus.rest.endpoint104.schema.Schema104;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint104")
public class Endpoint104Resource {

    private final Service104 service;

    public Endpoint104Resource(Service104 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema104 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
