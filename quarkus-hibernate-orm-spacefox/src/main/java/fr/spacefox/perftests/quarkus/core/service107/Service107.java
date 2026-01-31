package fr.spacefox.perftests.quarkus.core.service107;

import fr.spacefox.perftests.quarkus.core.port.data.Entity107DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service107.model.Model107;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service107 {

    private final Entity107DatasourcePort datasource;

    public Service107(Entity107DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model107 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
