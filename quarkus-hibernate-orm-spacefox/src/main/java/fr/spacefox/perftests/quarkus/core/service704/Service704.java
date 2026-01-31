package fr.spacefox.perftests.quarkus.core.service704;

import fr.spacefox.perftests.quarkus.core.port.data.Entity704DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service704.model.Model704;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service704 {

    private final Entity704DatasourcePort datasource;

    public Service704(Entity704DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model704 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
