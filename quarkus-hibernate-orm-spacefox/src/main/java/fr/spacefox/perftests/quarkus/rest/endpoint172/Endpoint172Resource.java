package fr.spacefox.perftests.quarkus.rest.endpoint172;

import fr.spacefox.perftests.quarkus.core.service172.Service172;
import fr.spacefox.perftests.quarkus.rest.endpoint172.schema.Schema172;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint172")
public class Endpoint172Resource {

    private final Service172 service;

    public Endpoint172Resource(Service172 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema172 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
