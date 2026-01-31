package fr.spacefox.perftests.quarkus.core.service381;

import fr.spacefox.perftests.quarkus.core.port.data.Entity381DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service381.model.Model381;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service381 {

    private final Entity381DatasourcePort datasource;

    public Service381(Entity381DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model381 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
