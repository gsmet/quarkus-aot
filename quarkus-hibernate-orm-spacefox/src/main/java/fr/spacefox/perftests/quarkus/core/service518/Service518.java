package fr.spacefox.perftests.quarkus.core.service518;

import fr.spacefox.perftests.quarkus.core.port.data.Entity518DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service518.model.Model518;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service518 {

    private final Entity518DatasourcePort datasource;

    public Service518(Entity518DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model518 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
