package fr.spacefox.perftests.quarkus.core.service946;

import fr.spacefox.perftests.quarkus.core.port.data.Entity946DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service946.model.Model946;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service946 {

    private final Entity946DatasourcePort datasource;

    public Service946(Entity946DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model946 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
