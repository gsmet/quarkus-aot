package fr.spacefox.perftests.quarkus.rest.endpoint122;

import fr.spacefox.perftests.quarkus.core.service122.Service122;
import fr.spacefox.perftests.quarkus.rest.endpoint122.schema.Schema122;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint122")
public class Endpoint122Resource {

    private final Service122 service;

    public Endpoint122Resource(Service122 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema122 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
