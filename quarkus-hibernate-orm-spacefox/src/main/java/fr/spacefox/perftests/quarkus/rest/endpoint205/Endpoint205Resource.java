package fr.spacefox.perftests.quarkus.rest.endpoint205;

import fr.spacefox.perftests.quarkus.core.service205.Service205;
import fr.spacefox.perftests.quarkus.rest.endpoint205.schema.Schema205;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint205")
public class Endpoint205Resource {

    private final Service205 service;

    public Endpoint205Resource(Service205 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema205 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
