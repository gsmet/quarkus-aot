package fr.spacefox.perftests.quarkus.core.service724;

import fr.spacefox.perftests.quarkus.core.port.data.Entity724DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service724.model.Model724;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service724 {

    private final Entity724DatasourcePort datasource;

    public Service724(Entity724DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model724 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
