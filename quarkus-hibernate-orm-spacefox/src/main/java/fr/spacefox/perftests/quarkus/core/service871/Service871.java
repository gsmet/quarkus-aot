package fr.spacefox.perftests.quarkus.core.service871;

import fr.spacefox.perftests.quarkus.core.port.data.Entity871DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service871.model.Model871;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service871 {

    private final Entity871DatasourcePort datasource;

    public Service871(Entity871DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model871 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
