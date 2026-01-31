package fr.spacefox.perftests.quarkus.core.service299;

import fr.spacefox.perftests.quarkus.core.port.data.Entity299DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service299.model.Model299;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service299 {

    private final Entity299DatasourcePort datasource;

    public Service299(Entity299DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model299 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
