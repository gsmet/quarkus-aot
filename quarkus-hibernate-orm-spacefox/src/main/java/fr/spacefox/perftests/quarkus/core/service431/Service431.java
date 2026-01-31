package fr.spacefox.perftests.quarkus.core.service431;

import fr.spacefox.perftests.quarkus.core.port.data.Entity431DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service431.model.Model431;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service431 {

    private final Entity431DatasourcePort datasource;

    public Service431(Entity431DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model431 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
