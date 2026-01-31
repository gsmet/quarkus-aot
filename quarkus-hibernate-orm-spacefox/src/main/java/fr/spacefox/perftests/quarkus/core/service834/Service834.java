package fr.spacefox.perftests.quarkus.core.service834;

import fr.spacefox.perftests.quarkus.core.port.data.Entity834DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service834.model.Model834;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service834 {

    private final Entity834DatasourcePort datasource;

    public Service834(Entity834DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model834 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
