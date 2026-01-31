package fr.spacefox.perftests.quarkus.core.service623;

import fr.spacefox.perftests.quarkus.core.port.data.Entity623DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service623.model.Model623;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service623 {

    private final Entity623DatasourcePort datasource;

    public Service623(Entity623DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model623 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
