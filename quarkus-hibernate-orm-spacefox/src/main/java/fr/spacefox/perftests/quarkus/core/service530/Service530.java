package fr.spacefox.perftests.quarkus.core.service530;

import fr.spacefox.perftests.quarkus.core.port.data.Entity530DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service530.model.Model530;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service530 {

    private final Entity530DatasourcePort datasource;

    public Service530(Entity530DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model530 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
