package fr.spacefox.perftests.quarkus.core.service793;

import fr.spacefox.perftests.quarkus.core.port.data.Entity793DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service793.model.Model793;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service793 {

    private final Entity793DatasourcePort datasource;

    public Service793(Entity793DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model793 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
