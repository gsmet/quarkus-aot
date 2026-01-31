package fr.spacefox.perftests.quarkus.core.service387;

import fr.spacefox.perftests.quarkus.core.port.data.Entity387DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service387.model.Model387;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service387 {

    private final Entity387DatasourcePort datasource;

    public Service387(Entity387DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model387 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
