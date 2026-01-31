package fr.spacefox.perftests.quarkus.core.service403;

import fr.spacefox.perftests.quarkus.core.port.data.Entity403DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service403.model.Model403;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service403 {

    private final Entity403DatasourcePort datasource;

    public Service403(Entity403DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model403 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
