package fr.spacefox.perftests.quarkus.core.service822;

import fr.spacefox.perftests.quarkus.core.port.data.Entity822DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service822.model.Model822;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service822 {

    private final Entity822DatasourcePort datasource;

    public Service822(Entity822DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model822 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
