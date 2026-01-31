package fr.spacefox.perftests.quarkus.rest.endpoint4;

import fr.spacefox.perftests.quarkus.core.service4.Service4;
import fr.spacefox.perftests.quarkus.rest.endpoint4.schema.Schema4;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint4")
public class Endpoint4Resource {

    private final Service4 service;

    public Endpoint4Resource(Service4 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema4 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
