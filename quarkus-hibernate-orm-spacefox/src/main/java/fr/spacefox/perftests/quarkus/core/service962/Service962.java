package fr.spacefox.perftests.quarkus.core.service962;

import fr.spacefox.perftests.quarkus.core.port.data.Entity962DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service962.model.Model962;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service962 {

    private final Entity962DatasourcePort datasource;

    public Service962(Entity962DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model962 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
