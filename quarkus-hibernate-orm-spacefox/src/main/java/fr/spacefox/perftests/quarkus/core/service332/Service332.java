package fr.spacefox.perftests.quarkus.core.service332;

import fr.spacefox.perftests.quarkus.core.port.data.Entity332DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service332.model.Model332;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service332 {

    private final Entity332DatasourcePort datasource;

    public Service332(Entity332DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model332 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
