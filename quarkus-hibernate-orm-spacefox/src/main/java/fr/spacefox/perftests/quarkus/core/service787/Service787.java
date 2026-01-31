package fr.spacefox.perftests.quarkus.core.service787;

import fr.spacefox.perftests.quarkus.core.port.data.Entity787DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service787.model.Model787;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service787 {

    private final Entity787DatasourcePort datasource;

    public Service787(Entity787DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model787 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
