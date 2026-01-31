package fr.spacefox.perftests.quarkus.core.service711;

import fr.spacefox.perftests.quarkus.core.port.data.Entity711DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service711.model.Model711;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service711 {

    private final Entity711DatasourcePort datasource;

    public Service711(Entity711DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model711 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
