package fr.spacefox.perftests.quarkus.core.service736;

import fr.spacefox.perftests.quarkus.core.port.data.Entity736DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service736.model.Model736;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service736 {

    private final Entity736DatasourcePort datasource;

    public Service736(Entity736DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model736 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
