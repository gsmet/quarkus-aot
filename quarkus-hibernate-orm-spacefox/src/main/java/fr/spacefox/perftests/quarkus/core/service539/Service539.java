package fr.spacefox.perftests.quarkus.core.service539;

import fr.spacefox.perftests.quarkus.core.port.data.Entity539DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service539.model.Model539;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service539 {

    private final Entity539DatasourcePort datasource;

    public Service539(Entity539DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model539 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
