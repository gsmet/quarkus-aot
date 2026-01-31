package fr.spacefox.perftests.quarkus.core.service466;

import fr.spacefox.perftests.quarkus.core.port.data.Entity466DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service466.model.Model466;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service466 {

    private final Entity466DatasourcePort datasource;

    public Service466(Entity466DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model466 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
