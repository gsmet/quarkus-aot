package fr.spacefox.perftests.quarkus.core.service465;

import fr.spacefox.perftests.quarkus.core.port.data.Entity465DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service465.model.Model465;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service465 {

    private final Entity465DatasourcePort datasource;

    public Service465(Entity465DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model465 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
