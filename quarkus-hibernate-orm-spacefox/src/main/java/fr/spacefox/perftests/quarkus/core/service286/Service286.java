package fr.spacefox.perftests.quarkus.core.service286;

import fr.spacefox.perftests.quarkus.core.port.data.Entity286DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service286.model.Model286;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service286 {

    private final Entity286DatasourcePort datasource;

    public Service286(Entity286DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model286 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
