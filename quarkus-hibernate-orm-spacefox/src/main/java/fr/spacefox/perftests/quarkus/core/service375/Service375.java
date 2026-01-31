package fr.spacefox.perftests.quarkus.core.service375;

import fr.spacefox.perftests.quarkus.core.port.data.Entity375DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service375.model.Model375;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service375 {

    private final Entity375DatasourcePort datasource;

    public Service375(Entity375DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model375 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
