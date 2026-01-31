package fr.spacefox.perftests.quarkus.core.service309;

import fr.spacefox.perftests.quarkus.core.port.data.Entity309DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service309.model.Model309;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service309 {

    private final Entity309DatasourcePort datasource;

    public Service309(Entity309DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model309 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
