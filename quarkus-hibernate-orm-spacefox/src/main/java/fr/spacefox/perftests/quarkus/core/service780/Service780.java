package fr.spacefox.perftests.quarkus.core.service780;

import fr.spacefox.perftests.quarkus.core.port.data.Entity780DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service780.model.Model780;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service780 {

    private final Entity780DatasourcePort datasource;

    public Service780(Entity780DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model780 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
