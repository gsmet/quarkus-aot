package fr.spacefox.perftests.quarkus.core.service599;

import fr.spacefox.perftests.quarkus.core.port.data.Entity599DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service599.model.Model599;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service599 {

    private final Entity599DatasourcePort datasource;

    public Service599(Entity599DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model599 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
