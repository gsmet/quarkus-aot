package fr.spacefox.perftests.quarkus.core.service973;

import fr.spacefox.perftests.quarkus.core.port.data.Entity973DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service973.model.Model973;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service973 {

    private final Entity973DatasourcePort datasource;

    public Service973(Entity973DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model973 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
