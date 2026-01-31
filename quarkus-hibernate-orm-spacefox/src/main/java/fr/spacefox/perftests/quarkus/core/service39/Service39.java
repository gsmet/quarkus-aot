package fr.spacefox.perftests.quarkus.core.service39;

import fr.spacefox.perftests.quarkus.core.port.data.Entity39DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service39.model.Model39;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service39 {

    private final Entity39DatasourcePort datasource;

    public Service39(Entity39DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model39 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
