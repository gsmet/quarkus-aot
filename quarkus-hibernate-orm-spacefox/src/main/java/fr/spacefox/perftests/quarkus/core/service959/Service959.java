package fr.spacefox.perftests.quarkus.core.service959;

import fr.spacefox.perftests.quarkus.core.port.data.Entity959DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service959.model.Model959;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service959 {

    private final Entity959DatasourcePort datasource;

    public Service959(Entity959DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model959 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
