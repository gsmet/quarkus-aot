package fr.spacefox.perftests.quarkus.core.service82;

import fr.spacefox.perftests.quarkus.core.port.data.Entity82DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service82.model.Model82;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service82 {

    private final Entity82DatasourcePort datasource;

    public Service82(Entity82DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model82 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
