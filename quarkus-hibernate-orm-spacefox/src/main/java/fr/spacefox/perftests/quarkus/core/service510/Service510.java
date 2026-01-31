package fr.spacefox.perftests.quarkus.core.service510;

import fr.spacefox.perftests.quarkus.core.port.data.Entity510DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service510.model.Model510;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service510 {

    private final Entity510DatasourcePort datasource;

    public Service510(Entity510DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model510 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
