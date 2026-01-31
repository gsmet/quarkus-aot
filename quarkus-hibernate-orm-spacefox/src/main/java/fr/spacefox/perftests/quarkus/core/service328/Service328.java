package fr.spacefox.perftests.quarkus.core.service328;

import fr.spacefox.perftests.quarkus.core.port.data.Entity328DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service328.model.Model328;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service328 {

    private final Entity328DatasourcePort datasource;

    public Service328(Entity328DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model328 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
