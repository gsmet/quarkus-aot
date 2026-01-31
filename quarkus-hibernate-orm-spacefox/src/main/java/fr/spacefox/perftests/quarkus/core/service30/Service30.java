package fr.spacefox.perftests.quarkus.core.service30;

import fr.spacefox.perftests.quarkus.core.port.data.Entity30DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service30.model.Model30;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service30 {

    private final Entity30DatasourcePort datasource;

    public Service30(Entity30DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model30 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
