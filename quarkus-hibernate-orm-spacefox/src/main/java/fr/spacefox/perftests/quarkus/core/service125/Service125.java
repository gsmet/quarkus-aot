package fr.spacefox.perftests.quarkus.core.service125;

import fr.spacefox.perftests.quarkus.core.port.data.Entity125DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service125.model.Model125;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service125 {

    private final Entity125DatasourcePort datasource;

    public Service125(Entity125DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model125 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
