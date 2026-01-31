package fr.spacefox.perftests.quarkus.rest.endpoint981;

import fr.spacefox.perftests.quarkus.core.service981.Service981;
import fr.spacefox.perftests.quarkus.rest.endpoint981.schema.Schema981;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint981")
public class Endpoint981Resource {

    private final Service981 service;

    public Endpoint981Resource(Service981 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema981 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
