package fr.spacefox.perftests.quarkus.core.service196;

import fr.spacefox.perftests.quarkus.core.port.data.Entity196DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service196.model.Model196;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service196 {

    private final Entity196DatasourcePort datasource;

    public Service196(Entity196DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model196 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
