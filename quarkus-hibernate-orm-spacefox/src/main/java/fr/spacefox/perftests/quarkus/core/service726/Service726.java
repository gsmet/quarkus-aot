package fr.spacefox.perftests.quarkus.core.service726;

import fr.spacefox.perftests.quarkus.core.port.data.Entity726DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service726.model.Model726;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service726 {

    private final Entity726DatasourcePort datasource;

    public Service726(Entity726DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model726 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
