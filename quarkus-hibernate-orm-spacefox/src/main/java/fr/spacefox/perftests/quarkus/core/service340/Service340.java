package fr.spacefox.perftests.quarkus.core.service340;

import fr.spacefox.perftests.quarkus.core.port.data.Entity340DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service340.model.Model340;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service340 {

    private final Entity340DatasourcePort datasource;

    public Service340(Entity340DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model340 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
