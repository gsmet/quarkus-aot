package fr.spacefox.perftests.quarkus.core.service59;

import fr.spacefox.perftests.quarkus.core.port.data.Entity59DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service59.model.Model59;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service59 {

    private final Entity59DatasourcePort datasource;

    public Service59(Entity59DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model59 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
