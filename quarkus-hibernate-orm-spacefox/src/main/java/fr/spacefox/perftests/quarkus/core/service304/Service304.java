package fr.spacefox.perftests.quarkus.core.service304;

import fr.spacefox.perftests.quarkus.core.port.data.Entity304DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service304.model.Model304;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service304 {

    private final Entity304DatasourcePort datasource;

    public Service304(Entity304DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model304 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
