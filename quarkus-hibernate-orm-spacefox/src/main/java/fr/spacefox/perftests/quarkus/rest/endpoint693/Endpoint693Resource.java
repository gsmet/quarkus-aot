package fr.spacefox.perftests.quarkus.rest.endpoint693;

import fr.spacefox.perftests.quarkus.core.service693.Service693;
import fr.spacefox.perftests.quarkus.rest.endpoint693.schema.Schema693;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint693")
public class Endpoint693Resource {

    private final Service693 service;

    public Endpoint693Resource(Service693 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema693 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
