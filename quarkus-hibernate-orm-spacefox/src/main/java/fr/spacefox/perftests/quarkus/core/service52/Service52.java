package fr.spacefox.perftests.quarkus.core.service52;

import fr.spacefox.perftests.quarkus.core.port.data.Entity52DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service52.model.Model52;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service52 {

    private final Entity52DatasourcePort datasource;

    public Service52(Entity52DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model52 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
