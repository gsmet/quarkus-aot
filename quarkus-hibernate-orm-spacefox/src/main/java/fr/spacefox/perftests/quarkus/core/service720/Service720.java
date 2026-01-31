package fr.spacefox.perftests.quarkus.core.service720;

import fr.spacefox.perftests.quarkus.core.port.data.Entity720DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service720.model.Model720;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service720 {

    private final Entity720DatasourcePort datasource;

    public Service720(Entity720DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model720 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
