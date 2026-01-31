package fr.spacefox.perftests.quarkus.core.service788;

import fr.spacefox.perftests.quarkus.core.port.data.Entity788DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service788.model.Model788;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service788 {

    private final Entity788DatasourcePort datasource;

    public Service788(Entity788DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model788 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
