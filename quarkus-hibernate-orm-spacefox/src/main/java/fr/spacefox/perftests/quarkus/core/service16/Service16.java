package fr.spacefox.perftests.quarkus.core.service16;

import fr.spacefox.perftests.quarkus.core.port.data.Entity16DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service16.model.Model16;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service16 {

    private final Entity16DatasourcePort datasource;

    public Service16(Entity16DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model16 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
