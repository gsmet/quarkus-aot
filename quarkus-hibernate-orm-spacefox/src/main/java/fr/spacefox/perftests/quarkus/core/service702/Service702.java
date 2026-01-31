package fr.spacefox.perftests.quarkus.core.service702;

import fr.spacefox.perftests.quarkus.core.port.data.Entity702DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service702.model.Model702;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service702 {

    private final Entity702DatasourcePort datasource;

    public Service702(Entity702DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model702 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
