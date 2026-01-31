package fr.spacefox.perftests.quarkus.core.service916;

import fr.spacefox.perftests.quarkus.core.port.data.Entity916DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service916.model.Model916;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service916 {

    private final Entity916DatasourcePort datasource;

    public Service916(Entity916DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model916 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
