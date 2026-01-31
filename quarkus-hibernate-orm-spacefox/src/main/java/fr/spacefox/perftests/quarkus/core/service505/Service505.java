package fr.spacefox.perftests.quarkus.core.service505;

import fr.spacefox.perftests.quarkus.core.port.data.Entity505DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service505.model.Model505;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service505 {

    private final Entity505DatasourcePort datasource;

    public Service505(Entity505DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model505 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
