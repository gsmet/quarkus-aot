package fr.spacefox.perftests.quarkus.core.service668;

import fr.spacefox.perftests.quarkus.core.port.data.Entity668DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service668.model.Model668;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service668 {

    private final Entity668DatasourcePort datasource;

    public Service668(Entity668DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model668 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
