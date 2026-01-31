package fr.spacefox.perftests.quarkus.rest.endpoint942;

import fr.spacefox.perftests.quarkus.core.service942.Service942;
import fr.spacefox.perftests.quarkus.rest.endpoint942.schema.Schema942;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint942")
public class Endpoint942Resource {

    private final Service942 service;

    public Endpoint942Resource(Service942 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema942 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
