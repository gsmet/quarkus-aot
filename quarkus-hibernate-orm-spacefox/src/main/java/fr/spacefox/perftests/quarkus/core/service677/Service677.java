package fr.spacefox.perftests.quarkus.core.service677;

import fr.spacefox.perftests.quarkus.core.port.data.Entity677DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service677.model.Model677;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service677 {

    private final Entity677DatasourcePort datasource;

    public Service677(Entity677DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model677 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
