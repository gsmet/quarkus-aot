package fr.spacefox.perftests.quarkus.core.service695;

import fr.spacefox.perftests.quarkus.core.port.data.Entity695DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service695.model.Model695;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service695 {

    private final Entity695DatasourcePort datasource;

    public Service695(Entity695DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model695 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
