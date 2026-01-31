package fr.spacefox.perftests.quarkus.core.service531;

import fr.spacefox.perftests.quarkus.core.port.data.Entity531DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service531.model.Model531;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service531 {

    private final Entity531DatasourcePort datasource;

    public Service531(Entity531DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model531 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
