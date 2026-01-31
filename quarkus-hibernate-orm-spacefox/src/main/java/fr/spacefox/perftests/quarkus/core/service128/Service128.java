package fr.spacefox.perftests.quarkus.core.service128;

import fr.spacefox.perftests.quarkus.core.port.data.Entity128DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service128.model.Model128;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service128 {

    private final Entity128DatasourcePort datasource;

    public Service128(Entity128DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model128 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
