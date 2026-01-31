package fr.spacefox.perftests.quarkus.core.service709;

import fr.spacefox.perftests.quarkus.core.port.data.Entity709DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service709.model.Model709;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service709 {

    private final Entity709DatasourcePort datasource;

    public Service709(Entity709DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model709 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
