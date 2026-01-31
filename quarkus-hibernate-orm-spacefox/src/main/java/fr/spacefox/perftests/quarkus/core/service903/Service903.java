package fr.spacefox.perftests.quarkus.core.service903;

import fr.spacefox.perftests.quarkus.core.port.data.Entity903DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service903.model.Model903;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service903 {

    private final Entity903DatasourcePort datasource;

    public Service903(Entity903DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model903 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
