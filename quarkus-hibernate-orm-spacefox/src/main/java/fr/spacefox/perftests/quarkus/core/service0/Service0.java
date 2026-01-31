package fr.spacefox.perftests.quarkus.core.service0;

import fr.spacefox.perftests.quarkus.core.port.data.Entity0DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service0.model.Model0;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service0 {

    private final Entity0DatasourcePort datasource;

    public Service0(Entity0DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model0 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
