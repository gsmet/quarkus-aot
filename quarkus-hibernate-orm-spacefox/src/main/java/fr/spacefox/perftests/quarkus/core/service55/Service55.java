package fr.spacefox.perftests.quarkus.core.service55;

import fr.spacefox.perftests.quarkus.core.port.data.Entity55DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service55.model.Model55;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service55 {

    private final Entity55DatasourcePort datasource;

    public Service55(Entity55DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model55 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
