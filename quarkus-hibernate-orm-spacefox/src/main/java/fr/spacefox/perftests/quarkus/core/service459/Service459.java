package fr.spacefox.perftests.quarkus.core.service459;

import fr.spacefox.perftests.quarkus.core.port.data.Entity459DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service459.model.Model459;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service459 {

    private final Entity459DatasourcePort datasource;

    public Service459(Entity459DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model459 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
