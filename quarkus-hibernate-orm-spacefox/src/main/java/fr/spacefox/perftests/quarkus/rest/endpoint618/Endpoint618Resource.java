package fr.spacefox.perftests.quarkus.rest.endpoint618;

import fr.spacefox.perftests.quarkus.core.service618.Service618;
import fr.spacefox.perftests.quarkus.rest.endpoint618.schema.Schema618;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint618")
public class Endpoint618Resource {

    private final Service618 service;

    public Endpoint618Resource(Service618 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema618 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
