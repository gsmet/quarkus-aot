package fr.spacefox.perftests.quarkus.core.service579;

import fr.spacefox.perftests.quarkus.core.port.data.Entity579DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service579.model.Model579;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service579 {

    private final Entity579DatasourcePort datasource;

    public Service579(Entity579DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model579 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
