package fr.spacefox.perftests.quarkus.core.service334;

import fr.spacefox.perftests.quarkus.core.port.data.Entity334DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service334.model.Model334;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service334 {

    private final Entity334DatasourcePort datasource;

    public Service334(Entity334DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model334 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
