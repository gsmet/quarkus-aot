package fr.spacefox.perftests.quarkus.core.service198;

import fr.spacefox.perftests.quarkus.core.port.data.Entity198DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service198.model.Model198;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service198 {

    private final Entity198DatasourcePort datasource;

    public Service198(Entity198DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model198 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
