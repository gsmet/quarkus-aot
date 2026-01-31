package fr.spacefox.perftests.quarkus.core.service765;

import fr.spacefox.perftests.quarkus.core.port.data.Entity765DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service765.model.Model765;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service765 {

    private final Entity765DatasourcePort datasource;

    public Service765(Entity765DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model765 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
