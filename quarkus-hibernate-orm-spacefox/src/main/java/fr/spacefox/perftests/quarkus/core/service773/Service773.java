package fr.spacefox.perftests.quarkus.core.service773;

import fr.spacefox.perftests.quarkus.core.port.data.Entity773DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service773.model.Model773;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service773 {

    private final Entity773DatasourcePort datasource;

    public Service773(Entity773DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model773 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
