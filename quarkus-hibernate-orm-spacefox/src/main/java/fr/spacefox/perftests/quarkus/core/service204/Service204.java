package fr.spacefox.perftests.quarkus.core.service204;

import fr.spacefox.perftests.quarkus.core.port.data.Entity204DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service204.model.Model204;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service204 {

    private final Entity204DatasourcePort datasource;

    public Service204(Entity204DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model204 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
