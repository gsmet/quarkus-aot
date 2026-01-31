package fr.spacefox.perftests.quarkus.core.service553;

import fr.spacefox.perftests.quarkus.core.port.data.Entity553DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service553.model.Model553;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service553 {

    private final Entity553DatasourcePort datasource;

    public Service553(Entity553DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model553 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
