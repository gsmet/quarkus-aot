package fr.spacefox.perftests.quarkus.core.service658;

import fr.spacefox.perftests.quarkus.core.port.data.Entity658DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service658.model.Model658;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service658 {

    private final Entity658DatasourcePort datasource;

    public Service658(Entity658DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model658 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
