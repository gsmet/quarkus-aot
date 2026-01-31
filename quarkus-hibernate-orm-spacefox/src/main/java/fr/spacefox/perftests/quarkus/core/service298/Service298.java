package fr.spacefox.perftests.quarkus.core.service298;

import fr.spacefox.perftests.quarkus.core.port.data.Entity298DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service298.model.Model298;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service298 {

    private final Entity298DatasourcePort datasource;

    public Service298(Entity298DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model298 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
