package fr.spacefox.perftests.quarkus.core.service528;

import fr.spacefox.perftests.quarkus.core.port.data.Entity528DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service528.model.Model528;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service528 {

    private final Entity528DatasourcePort datasource;

    public Service528(Entity528DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model528 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
