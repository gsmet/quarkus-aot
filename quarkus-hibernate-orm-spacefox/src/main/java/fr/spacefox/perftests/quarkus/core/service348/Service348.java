package fr.spacefox.perftests.quarkus.core.service348;

import fr.spacefox.perftests.quarkus.core.port.data.Entity348DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service348.model.Model348;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service348 {

    private final Entity348DatasourcePort datasource;

    public Service348(Entity348DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model348 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
