package fr.spacefox.perftests.quarkus.core.service820;

import fr.spacefox.perftests.quarkus.core.port.data.Entity820DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service820.model.Model820;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service820 {

    private final Entity820DatasourcePort datasource;

    public Service820(Entity820DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model820 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
