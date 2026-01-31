package fr.spacefox.perftests.quarkus.core.service463;

import fr.spacefox.perftests.quarkus.core.port.data.Entity463DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service463.model.Model463;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service463 {

    private final Entity463DatasourcePort datasource;

    public Service463(Entity463DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model463 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
