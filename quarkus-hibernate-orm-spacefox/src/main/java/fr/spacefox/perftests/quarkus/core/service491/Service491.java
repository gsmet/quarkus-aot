package fr.spacefox.perftests.quarkus.core.service491;

import fr.spacefox.perftests.quarkus.core.port.data.Entity491DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service491.model.Model491;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service491 {

    private final Entity491DatasourcePort datasource;

    public Service491(Entity491DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model491 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
