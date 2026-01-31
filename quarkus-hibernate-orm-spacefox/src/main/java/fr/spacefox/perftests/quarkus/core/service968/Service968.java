package fr.spacefox.perftests.quarkus.core.service968;

import fr.spacefox.perftests.quarkus.core.port.data.Entity968DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service968.model.Model968;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service968 {

    private final Entity968DatasourcePort datasource;

    public Service968(Entity968DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model968 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
