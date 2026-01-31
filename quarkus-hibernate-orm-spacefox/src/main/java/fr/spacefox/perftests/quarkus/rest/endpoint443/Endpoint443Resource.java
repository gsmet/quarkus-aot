package fr.spacefox.perftests.quarkus.rest.endpoint443;

import fr.spacefox.perftests.quarkus.core.service443.Service443;
import fr.spacefox.perftests.quarkus.rest.endpoint443.schema.Schema443;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint443")
public class Endpoint443Resource {

    private final Service443 service;

    public Endpoint443Resource(Service443 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema443 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
