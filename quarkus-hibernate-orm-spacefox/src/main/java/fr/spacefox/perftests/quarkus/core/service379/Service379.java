package fr.spacefox.perftests.quarkus.core.service379;

import fr.spacefox.perftests.quarkus.core.port.data.Entity379DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service379.model.Model379;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service379 {

    private final Entity379DatasourcePort datasource;

    public Service379(Entity379DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model379 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
