package fr.spacefox.perftests.quarkus.core.service942;

import fr.spacefox.perftests.quarkus.core.port.data.Entity942DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service942.model.Model942;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service942 {

    private final Entity942DatasourcePort datasource;

    public Service942(Entity942DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model942 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
