package fr.spacefox.perftests.quarkus.core.service141;

import fr.spacefox.perftests.quarkus.core.port.data.Entity141DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service141.model.Model141;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service141 {

    private final Entity141DatasourcePort datasource;

    public Service141(Entity141DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model141 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
