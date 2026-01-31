package fr.spacefox.perftests.quarkus.core.service800;

import fr.spacefox.perftests.quarkus.core.port.data.Entity800DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service800.model.Model800;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service800 {

    private final Entity800DatasourcePort datasource;

    public Service800(Entity800DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model800 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
