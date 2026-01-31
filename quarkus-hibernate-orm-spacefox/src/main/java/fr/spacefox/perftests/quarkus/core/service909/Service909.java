package fr.spacefox.perftests.quarkus.core.service909;

import fr.spacefox.perftests.quarkus.core.port.data.Entity909DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service909.model.Model909;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service909 {

    private final Entity909DatasourcePort datasource;

    public Service909(Entity909DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model909 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
