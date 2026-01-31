package fr.spacefox.perftests.quarkus.core.service245;

import fr.spacefox.perftests.quarkus.core.port.data.Entity245DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service245.model.Model245;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service245 {

    private final Entity245DatasourcePort datasource;

    public Service245(Entity245DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model245 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
