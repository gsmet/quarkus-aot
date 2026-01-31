package fr.spacefox.perftests.quarkus.core.service571;

import fr.spacefox.perftests.quarkus.core.port.data.Entity571DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service571.model.Model571;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service571 {

    private final Entity571DatasourcePort datasource;

    public Service571(Entity571DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model571 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
