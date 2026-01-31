package fr.spacefox.perftests.quarkus.core.service951;

import fr.spacefox.perftests.quarkus.core.port.data.Entity951DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service951.model.Model951;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service951 {

    private final Entity951DatasourcePort datasource;

    public Service951(Entity951DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model951 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
