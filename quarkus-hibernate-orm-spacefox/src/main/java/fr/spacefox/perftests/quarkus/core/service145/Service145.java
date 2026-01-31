package fr.spacefox.perftests.quarkus.core.service145;

import fr.spacefox.perftests.quarkus.core.port.data.Entity145DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service145.model.Model145;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service145 {

    private final Entity145DatasourcePort datasource;

    public Service145(Entity145DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model145 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
