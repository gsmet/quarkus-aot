package fr.spacefox.perftests.quarkus.core.service861;

import fr.spacefox.perftests.quarkus.core.port.data.Entity861DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service861.model.Model861;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service861 {

    private final Entity861DatasourcePort datasource;

    public Service861(Entity861DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model861 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
