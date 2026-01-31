package fr.spacefox.perftests.quarkus.core.service933;

import fr.spacefox.perftests.quarkus.core.port.data.Entity933DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service933.model.Model933;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service933 {

    private final Entity933DatasourcePort datasource;

    public Service933(Entity933DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model933 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
