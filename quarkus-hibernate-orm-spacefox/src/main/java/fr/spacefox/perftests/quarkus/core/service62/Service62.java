package fr.spacefox.perftests.quarkus.core.service62;

import fr.spacefox.perftests.quarkus.core.port.data.Entity62DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service62.model.Model62;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service62 {

    private final Entity62DatasourcePort datasource;

    public Service62(Entity62DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model62 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
