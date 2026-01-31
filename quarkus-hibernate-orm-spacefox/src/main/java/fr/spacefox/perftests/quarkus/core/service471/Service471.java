package fr.spacefox.perftests.quarkus.core.service471;

import fr.spacefox.perftests.quarkus.core.port.data.Entity471DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service471.model.Model471;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service471 {

    private final Entity471DatasourcePort datasource;

    public Service471(Entity471DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model471 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
