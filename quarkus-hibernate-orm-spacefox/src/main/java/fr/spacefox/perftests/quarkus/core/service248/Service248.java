package fr.spacefox.perftests.quarkus.core.service248;

import fr.spacefox.perftests.quarkus.core.port.data.Entity248DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service248.model.Model248;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service248 {

    private final Entity248DatasourcePort datasource;

    public Service248(Entity248DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model248 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
