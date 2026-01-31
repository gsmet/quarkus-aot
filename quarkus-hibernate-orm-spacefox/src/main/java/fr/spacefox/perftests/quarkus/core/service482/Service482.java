package fr.spacefox.perftests.quarkus.core.service482;

import fr.spacefox.perftests.quarkus.core.port.data.Entity482DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service482.model.Model482;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service482 {

    private final Entity482DatasourcePort datasource;

    public Service482(Entity482DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model482 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
