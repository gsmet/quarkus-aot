package fr.spacefox.perftests.quarkus.core.service325;

import fr.spacefox.perftests.quarkus.core.port.data.Entity325DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service325.model.Model325;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service325 {

    private final Entity325DatasourcePort datasource;

    public Service325(Entity325DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model325 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
