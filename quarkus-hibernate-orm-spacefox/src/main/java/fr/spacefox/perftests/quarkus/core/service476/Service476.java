package fr.spacefox.perftests.quarkus.core.service476;

import fr.spacefox.perftests.quarkus.core.port.data.Entity476DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service476.model.Model476;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service476 {

    private final Entity476DatasourcePort datasource;

    public Service476(Entity476DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model476 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
