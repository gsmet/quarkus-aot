package fr.spacefox.perftests.quarkus.core.service453;

import fr.spacefox.perftests.quarkus.core.port.data.Entity453DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service453.model.Model453;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service453 {

    private final Entity453DatasourcePort datasource;

    public Service453(Entity453DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model453 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
