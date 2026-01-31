package fr.spacefox.perftests.quarkus.core.service558;

import fr.spacefox.perftests.quarkus.core.port.data.Entity558DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service558.model.Model558;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service558 {

    private final Entity558DatasourcePort datasource;

    public Service558(Entity558DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model558 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
