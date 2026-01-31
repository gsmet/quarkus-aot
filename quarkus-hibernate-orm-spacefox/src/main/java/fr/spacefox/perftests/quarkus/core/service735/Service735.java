package fr.spacefox.perftests.quarkus.core.service735;

import fr.spacefox.perftests.quarkus.core.port.data.Entity735DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service735.model.Model735;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service735 {

    private final Entity735DatasourcePort datasource;

    public Service735(Entity735DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model735 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
