package fr.spacefox.perftests.quarkus.rest.endpoint193;

import fr.spacefox.perftests.quarkus.core.service193.Service193;
import fr.spacefox.perftests.quarkus.rest.endpoint193.schema.Schema193;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint193")
public class Endpoint193Resource {

    private final Service193 service;

    public Endpoint193Resource(Service193 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema193 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
