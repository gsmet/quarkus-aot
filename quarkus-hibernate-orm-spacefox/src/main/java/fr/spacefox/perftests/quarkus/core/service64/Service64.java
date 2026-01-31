package fr.spacefox.perftests.quarkus.core.service64;

import fr.spacefox.perftests.quarkus.core.port.data.Entity64DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service64.model.Model64;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service64 {

    private final Entity64DatasourcePort datasource;

    public Service64(Entity64DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model64 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
