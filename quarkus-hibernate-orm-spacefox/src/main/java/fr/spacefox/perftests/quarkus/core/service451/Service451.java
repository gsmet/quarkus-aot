package fr.spacefox.perftests.quarkus.core.service451;

import fr.spacefox.perftests.quarkus.core.port.data.Entity451DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service451.model.Model451;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service451 {

    private final Entity451DatasourcePort datasource;

    public Service451(Entity451DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model451 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
