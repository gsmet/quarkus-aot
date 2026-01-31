package fr.spacefox.perftests.quarkus.core.service809;

import fr.spacefox.perftests.quarkus.core.port.data.Entity809DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service809.model.Model809;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service809 {

    private final Entity809DatasourcePort datasource;

    public Service809(Entity809DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model809 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
