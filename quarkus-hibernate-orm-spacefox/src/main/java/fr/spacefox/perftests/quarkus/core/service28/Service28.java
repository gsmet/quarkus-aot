package fr.spacefox.perftests.quarkus.core.service28;

import fr.spacefox.perftests.quarkus.core.port.data.Entity28DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service28.model.Model28;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service28 {

    private final Entity28DatasourcePort datasource;

    public Service28(Entity28DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model28 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
