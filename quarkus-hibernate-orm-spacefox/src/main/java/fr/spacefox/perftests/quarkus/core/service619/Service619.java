package fr.spacefox.perftests.quarkus.core.service619;

import fr.spacefox.perftests.quarkus.core.port.data.Entity619DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service619.model.Model619;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service619 {

    private final Entity619DatasourcePort datasource;

    public Service619(Entity619DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model619 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
