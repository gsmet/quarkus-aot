package fr.spacefox.perftests.quarkus.core.service600;

import fr.spacefox.perftests.quarkus.core.port.data.Entity600DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service600.model.Model600;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service600 {

    private final Entity600DatasourcePort datasource;

    public Service600(Entity600DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model600 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
