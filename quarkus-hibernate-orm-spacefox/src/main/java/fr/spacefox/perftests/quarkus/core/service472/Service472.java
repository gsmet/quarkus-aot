package fr.spacefox.perftests.quarkus.core.service472;

import fr.spacefox.perftests.quarkus.core.port.data.Entity472DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service472.model.Model472;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service472 {

    private final Entity472DatasourcePort datasource;

    public Service472(Entity472DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model472 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
