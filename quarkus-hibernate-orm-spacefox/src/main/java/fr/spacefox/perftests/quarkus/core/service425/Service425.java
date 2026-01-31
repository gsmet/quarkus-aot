package fr.spacefox.perftests.quarkus.core.service425;

import fr.spacefox.perftests.quarkus.core.port.data.Entity425DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service425.model.Model425;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service425 {

    private final Entity425DatasourcePort datasource;

    public Service425(Entity425DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model425 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
