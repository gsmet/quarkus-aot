package fr.spacefox.perftests.quarkus.rest.endpoint965;

import fr.spacefox.perftests.quarkus.core.service965.Service965;
import fr.spacefox.perftests.quarkus.rest.endpoint965.schema.Schema965;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint965")
public class Endpoint965Resource {

    private final Service965 service;

    public Endpoint965Resource(Service965 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema965 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
