package fr.spacefox.perftests.quarkus.core.service610;

import fr.spacefox.perftests.quarkus.core.port.data.Entity610DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service610.model.Model610;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service610 {

    private final Entity610DatasourcePort datasource;

    public Service610(Entity610DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model610 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
