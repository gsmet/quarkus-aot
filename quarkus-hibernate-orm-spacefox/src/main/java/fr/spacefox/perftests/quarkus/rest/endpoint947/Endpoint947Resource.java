package fr.spacefox.perftests.quarkus.rest.endpoint947;

import fr.spacefox.perftests.quarkus.core.service947.Service947;
import fr.spacefox.perftests.quarkus.rest.endpoint947.schema.Schema947;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint947")
public class Endpoint947Resource {

    private final Service947 service;

    public Endpoint947Resource(Service947 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema947 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
