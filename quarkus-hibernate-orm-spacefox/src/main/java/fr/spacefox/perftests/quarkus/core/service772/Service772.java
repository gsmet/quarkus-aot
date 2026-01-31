package fr.spacefox.perftests.quarkus.core.service772;

import fr.spacefox.perftests.quarkus.core.port.data.Entity772DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service772.model.Model772;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service772 {

    private final Entity772DatasourcePort datasource;

    public Service772(Entity772DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model772 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
