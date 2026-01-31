package fr.spacefox.perftests.quarkus.core.service432;

import fr.spacefox.perftests.quarkus.core.port.data.Entity432DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service432.model.Model432;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service432 {

    private final Entity432DatasourcePort datasource;

    public Service432(Entity432DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model432 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
