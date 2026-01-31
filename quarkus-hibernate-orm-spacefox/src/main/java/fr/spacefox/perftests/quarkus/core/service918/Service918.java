package fr.spacefox.perftests.quarkus.core.service918;

import fr.spacefox.perftests.quarkus.core.port.data.Entity918DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service918.model.Model918;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service918 {

    private final Entity918DatasourcePort datasource;

    public Service918(Entity918DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model918 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
