package fr.spacefox.perftests.quarkus.core.service585;

import fr.spacefox.perftests.quarkus.core.port.data.Entity585DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service585.model.Model585;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service585 {

    private final Entity585DatasourcePort datasource;

    public Service585(Entity585DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model585 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
