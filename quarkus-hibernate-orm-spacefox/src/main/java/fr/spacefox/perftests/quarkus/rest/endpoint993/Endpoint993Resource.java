package fr.spacefox.perftests.quarkus.rest.endpoint993;

import fr.spacefox.perftests.quarkus.core.service993.Service993;
import fr.spacefox.perftests.quarkus.rest.endpoint993.schema.Schema993;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint993")
public class Endpoint993Resource {

    private final Service993 service;

    public Endpoint993Resource(Service993 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema993 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
