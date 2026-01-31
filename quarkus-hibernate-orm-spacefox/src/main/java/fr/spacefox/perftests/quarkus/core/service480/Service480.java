package fr.spacefox.perftests.quarkus.core.service480;

import fr.spacefox.perftests.quarkus.core.port.data.Entity480DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service480.model.Model480;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service480 {

    private final Entity480DatasourcePort datasource;

    public Service480(Entity480DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model480 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
