package fr.spacefox.perftests.quarkus.core.service70;

import fr.spacefox.perftests.quarkus.core.port.data.Entity70DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service70.model.Model70;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service70 {

    private final Entity70DatasourcePort datasource;

    public Service70(Entity70DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model70 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
