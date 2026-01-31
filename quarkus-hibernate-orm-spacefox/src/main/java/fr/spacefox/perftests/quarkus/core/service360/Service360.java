package fr.spacefox.perftests.quarkus.core.service360;

import fr.spacefox.perftests.quarkus.core.port.data.Entity360DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service360.model.Model360;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service360 {

    private final Entity360DatasourcePort datasource;

    public Service360(Entity360DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model360 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
