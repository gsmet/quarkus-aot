package fr.spacefox.perftests.quarkus.core.service48;

import fr.spacefox.perftests.quarkus.core.port.data.Entity48DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service48.model.Model48;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service48 {

    private final Entity48DatasourcePort datasource;

    public Service48(Entity48DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model48 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
