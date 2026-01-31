package fr.spacefox.perftests.quarkus.core.service919;

import fr.spacefox.perftests.quarkus.core.port.data.Entity919DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service919.model.Model919;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service919 {

    private final Entity919DatasourcePort datasource;

    public Service919(Entity919DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model919 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
