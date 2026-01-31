package fr.spacefox.perftests.quarkus.core.service988;

import fr.spacefox.perftests.quarkus.core.port.data.Entity988DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service988.model.Model988;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service988 {

    private final Entity988DatasourcePort datasource;

    public Service988(Entity988DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model988 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
