package fr.spacefox.perftests.quarkus.core.service456;

import fr.spacefox.perftests.quarkus.core.port.data.Entity456DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service456.model.Model456;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service456 {

    private final Entity456DatasourcePort datasource;

    public Service456(Entity456DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model456 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
