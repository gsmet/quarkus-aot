package fr.spacefox.perftests.quarkus.rest.endpoint890;

import fr.spacefox.perftests.quarkus.core.service890.Service890;
import fr.spacefox.perftests.quarkus.rest.endpoint890.schema.Schema890;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint890")
public class Endpoint890Resource {

    private final Service890 service;

    public Endpoint890Resource(Service890 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema890 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
