package fr.spacefox.perftests.quarkus.core.service876;

import fr.spacefox.perftests.quarkus.core.port.data.Entity876DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service876.model.Model876;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service876 {

    private final Entity876DatasourcePort datasource;

    public Service876(Entity876DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model876 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
