package fr.spacefox.perftests.quarkus.core.service382;

import fr.spacefox.perftests.quarkus.core.port.data.Entity382DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service382.model.Model382;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service382 {

    private final Entity382DatasourcePort datasource;

    public Service382(Entity382DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model382 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
