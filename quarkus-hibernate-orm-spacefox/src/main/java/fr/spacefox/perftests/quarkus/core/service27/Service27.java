package fr.spacefox.perftests.quarkus.core.service27;

import fr.spacefox.perftests.quarkus.core.port.data.Entity27DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service27.model.Model27;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service27 {

    private final Entity27DatasourcePort datasource;

    public Service27(Entity27DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model27 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
