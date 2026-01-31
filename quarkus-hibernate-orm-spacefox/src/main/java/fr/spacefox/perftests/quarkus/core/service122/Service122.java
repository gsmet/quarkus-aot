package fr.spacefox.perftests.quarkus.core.service122;

import fr.spacefox.perftests.quarkus.core.port.data.Entity122DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service122.model.Model122;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service122 {

    private final Entity122DatasourcePort datasource;

    public Service122(Entity122DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model122 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
