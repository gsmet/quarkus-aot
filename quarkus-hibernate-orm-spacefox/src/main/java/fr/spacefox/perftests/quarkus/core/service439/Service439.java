package fr.spacefox.perftests.quarkus.core.service439;

import fr.spacefox.perftests.quarkus.core.port.data.Entity439DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service439.model.Model439;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service439 {

    private final Entity439DatasourcePort datasource;

    public Service439(Entity439DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model439 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
