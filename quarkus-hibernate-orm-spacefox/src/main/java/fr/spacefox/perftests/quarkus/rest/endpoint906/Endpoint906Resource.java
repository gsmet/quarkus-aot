package fr.spacefox.perftests.quarkus.rest.endpoint906;

import fr.spacefox.perftests.quarkus.core.service906.Service906;
import fr.spacefox.perftests.quarkus.rest.endpoint906.schema.Schema906;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint906")
public class Endpoint906Resource {

    private final Service906 service;

    public Endpoint906Resource(Service906 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema906 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
