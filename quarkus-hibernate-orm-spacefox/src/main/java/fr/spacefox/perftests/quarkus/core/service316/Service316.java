package fr.spacefox.perftests.quarkus.core.service316;

import fr.spacefox.perftests.quarkus.core.port.data.Entity316DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service316.model.Model316;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service316 {

    private final Entity316DatasourcePort datasource;

    public Service316(Entity316DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model316 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
