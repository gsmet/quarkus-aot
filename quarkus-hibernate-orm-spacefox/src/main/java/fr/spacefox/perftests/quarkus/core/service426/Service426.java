package fr.spacefox.perftests.quarkus.core.service426;

import fr.spacefox.perftests.quarkus.core.port.data.Entity426DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service426.model.Model426;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service426 {

    private final Entity426DatasourcePort datasource;

    public Service426(Entity426DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model426 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
