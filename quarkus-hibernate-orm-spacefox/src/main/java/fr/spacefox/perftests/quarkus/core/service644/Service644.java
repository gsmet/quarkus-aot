package fr.spacefox.perftests.quarkus.core.service644;

import fr.spacefox.perftests.quarkus.core.port.data.Entity644DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service644.model.Model644;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service644 {

    private final Entity644DatasourcePort datasource;

    public Service644(Entity644DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model644 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
