package fr.spacefox.perftests.quarkus.core.service430;

import fr.spacefox.perftests.quarkus.core.port.data.Entity430DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service430.model.Model430;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service430 {

    private final Entity430DatasourcePort datasource;

    public Service430(Entity430DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model430 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
