package fr.spacefox.perftests.quarkus.core.service958;

import fr.spacefox.perftests.quarkus.core.port.data.Entity958DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service958.model.Model958;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service958 {

    private final Entity958DatasourcePort datasource;

    public Service958(Entity958DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model958 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
