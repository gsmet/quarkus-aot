package fr.spacefox.perftests.quarkus.core.service124;

import fr.spacefox.perftests.quarkus.core.port.data.Entity124DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service124.model.Model124;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service124 {

    private final Entity124DatasourcePort datasource;

    public Service124(Entity124DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model124 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
