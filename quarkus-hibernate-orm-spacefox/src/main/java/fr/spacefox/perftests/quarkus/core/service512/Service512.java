package fr.spacefox.perftests.quarkus.core.service512;

import fr.spacefox.perftests.quarkus.core.port.data.Entity512DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service512.model.Model512;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service512 {

    private final Entity512DatasourcePort datasource;

    public Service512(Entity512DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model512 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
