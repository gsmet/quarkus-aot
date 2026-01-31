package fr.spacefox.perftests.quarkus.core.service440;

import fr.spacefox.perftests.quarkus.core.port.data.Entity440DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service440.model.Model440;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service440 {

    private final Entity440DatasourcePort datasource;

    public Service440(Entity440DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model440 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
