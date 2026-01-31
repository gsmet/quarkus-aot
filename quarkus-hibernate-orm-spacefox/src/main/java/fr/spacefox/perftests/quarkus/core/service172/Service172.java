package fr.spacefox.perftests.quarkus.core.service172;

import fr.spacefox.perftests.quarkus.core.port.data.Entity172DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service172.model.Model172;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service172 {

    private final Entity172DatasourcePort datasource;

    public Service172(Entity172DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model172 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
