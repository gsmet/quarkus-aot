package fr.spacefox.perftests.quarkus.core.service813;

import fr.spacefox.perftests.quarkus.core.port.data.Entity813DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service813.model.Model813;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service813 {

    private final Entity813DatasourcePort datasource;

    public Service813(Entity813DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model813 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
