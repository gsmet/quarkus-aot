package fr.spacefox.perftests.quarkus.core.service497;

import fr.spacefox.perftests.quarkus.core.port.data.Entity497DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service497.model.Model497;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service497 {

    private final Entity497DatasourcePort datasource;

    public Service497(Entity497DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model497 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
