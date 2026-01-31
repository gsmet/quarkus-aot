package fr.spacefox.perftests.quarkus.core.service327;

import fr.spacefox.perftests.quarkus.core.port.data.Entity327DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service327.model.Model327;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service327 {

    private final Entity327DatasourcePort datasource;

    public Service327(Entity327DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model327 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
