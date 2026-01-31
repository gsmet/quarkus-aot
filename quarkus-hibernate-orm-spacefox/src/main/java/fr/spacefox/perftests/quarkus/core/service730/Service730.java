package fr.spacefox.perftests.quarkus.core.service730;

import fr.spacefox.perftests.quarkus.core.port.data.Entity730DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service730.model.Model730;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service730 {

    private final Entity730DatasourcePort datasource;

    public Service730(Entity730DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model730 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
