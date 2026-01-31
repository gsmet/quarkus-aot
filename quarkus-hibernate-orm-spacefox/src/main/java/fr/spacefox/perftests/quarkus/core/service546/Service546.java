package fr.spacefox.perftests.quarkus.core.service546;

import fr.spacefox.perftests.quarkus.core.port.data.Entity546DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service546.model.Model546;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service546 {

    private final Entity546DatasourcePort datasource;

    public Service546(Entity546DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model546 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
