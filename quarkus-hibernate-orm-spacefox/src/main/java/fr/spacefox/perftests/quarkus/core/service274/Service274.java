package fr.spacefox.perftests.quarkus.core.service274;

import fr.spacefox.perftests.quarkus.core.port.data.Entity274DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service274.model.Model274;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service274 {

    private final Entity274DatasourcePort datasource;

    public Service274(Entity274DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model274 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
