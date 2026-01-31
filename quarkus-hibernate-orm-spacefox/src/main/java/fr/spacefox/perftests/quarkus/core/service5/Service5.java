package fr.spacefox.perftests.quarkus.core.service5;

import fr.spacefox.perftests.quarkus.core.port.data.Entity5DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service5.model.Model5;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service5 {

    private final Entity5DatasourcePort datasource;

    public Service5(Entity5DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model5 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
