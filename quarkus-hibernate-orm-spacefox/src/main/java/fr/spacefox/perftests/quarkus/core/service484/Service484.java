package fr.spacefox.perftests.quarkus.core.service484;

import fr.spacefox.perftests.quarkus.core.port.data.Entity484DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service484.model.Model484;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service484 {

    private final Entity484DatasourcePort datasource;

    public Service484(Entity484DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model484 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
