package fr.spacefox.perftests.quarkus.core.service7;

import fr.spacefox.perftests.quarkus.core.port.data.Entity7DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service7.model.Model7;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service7 {

    private final Entity7DatasourcePort datasource;

    public Service7(Entity7DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model7 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
