package fr.spacefox.perftests.quarkus.rest.endpoint6;

import fr.spacefox.perftests.quarkus.core.service6.Service6;
import fr.spacefox.perftests.quarkus.rest.endpoint6.schema.Schema6;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint6")
public class Endpoint6Resource {

    private final Service6 service;

    public Endpoint6Resource(Service6 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema6 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
