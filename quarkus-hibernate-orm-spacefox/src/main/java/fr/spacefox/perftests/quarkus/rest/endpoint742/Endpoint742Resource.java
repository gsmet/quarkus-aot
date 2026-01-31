package fr.spacefox.perftests.quarkus.rest.endpoint742;

import fr.spacefox.perftests.quarkus.core.service742.Service742;
import fr.spacefox.perftests.quarkus.rest.endpoint742.schema.Schema742;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint742")
public class Endpoint742Resource {

    private final Service742 service;

    public Endpoint742Resource(Service742 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema742 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
