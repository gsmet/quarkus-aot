package fr.spacefox.perftests.quarkus.rest.endpoint244;

import fr.spacefox.perftests.quarkus.core.service244.Service244;
import fr.spacefox.perftests.quarkus.rest.endpoint244.schema.Schema244;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint244")
public class Endpoint244Resource {

    private final Service244 service;

    public Endpoint244Resource(Service244 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema244 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
