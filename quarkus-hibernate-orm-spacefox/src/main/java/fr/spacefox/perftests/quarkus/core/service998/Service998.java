package fr.spacefox.perftests.quarkus.core.service998;

import fr.spacefox.perftests.quarkus.core.port.data.Entity998DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service998.model.Model998;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service998 {

    private final Entity998DatasourcePort datasource;

    public Service998(Entity998DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model998 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
